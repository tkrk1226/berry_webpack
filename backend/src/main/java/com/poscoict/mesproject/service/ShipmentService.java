package com.poscoict.mesproject.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poscoict.mesproject.repository.ShipmentRepository;import com.poscoict.mesproject.vo.ShipmentVo;

@Service
public class ShipmentService {
	
	@Autowired
	private ShipmentRepository shipmentRepository;
	
	public List<Map<String, Object>> getMaterialsList(Object startDate, Object endDate){
		return shipmentRepository.findMaterialsByStartAndEndDate(startDate, endDate);
	}

	@Transactional
	public void registerMaterial(ShipmentVo vo) {
		
//		if(vo==null) {
//			throw new NullPointerException("VO가 NULL");
//		}
//		
//		if(!shipmentRepository.insertMaterialToShipmentMgm(vo)) {
//			throw new RuntimeException(" 실패 !");
//		}
		shipmentRepository.insertMaterialToShipmentMgm(vo);
		shipmentRepository.insertMaterialToMaterialMgm(vo);
	}

	@Transactional
	public void registerExcel(List<ShipmentVo> list) {
		for(ShipmentVo vo : list) {
			shipmentRepository.insertMaterialToShipmentMgm(vo);
			shipmentRepository.insertMaterialToMaterialMgm(vo);
		}
	}

	@Transactional
	public void updateMaterialList(List<ShipmentVo> list) {
		for(ShipmentVo vo : list) {
			shipmentRepository.updateMaterialToShipmentMgm(vo);
			shipmentRepository.updateMaterialToMaterialMgm(vo);
		}
	}

}
