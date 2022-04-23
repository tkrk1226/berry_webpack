package com.poscoict.mesproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.repository.ExportRepository;
import com.poscoict.mesproject.vo.ExportVo;

@Service
public class ExportService {

	@Autowired
	private ExportRepository exportRepository;
	
	// 검색조건에 맞는 입고된 재료 정보 얻기
	public List<ExportVo>  getMaterials() {
		List<ExportVo> list=exportRepository.findMaterials();
		return list;
	}
	
	// 상차 등록 시 고객사, 차량번호 업데이트
	public boolean updateDeliveryCode(ExportVo vo){
		System.out.println(vo + " from Service");
		return exportRepository.updateDelivery(vo);
	}
	
	// 출하 처리 시 진도코드, 상태코드 업데이트
	public boolean updateStateCode(String materialNumber){		
		System.out.println(materialNumber + " from Service");
		exportRepository.updateStateCode(materialNumber);		
		return true;			
	}
}
