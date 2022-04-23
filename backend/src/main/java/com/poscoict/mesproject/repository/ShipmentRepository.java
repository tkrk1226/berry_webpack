package com.poscoict.mesproject.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.poscoict.mesproject.vo.ShipmentVo;

@Repository
public class ShipmentRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<Map<String, Object>> findMaterialsByStartAndEndDate(Object startDate, Object endDate){
		Map<String, Object>map = new HashMap<>();
		map.put("startDate", startDate);
		map.put("endDate", endDate);
		return sqlSession.selectList("shipmentMgm.findMaterialsByStartAndEndDate", map);
	}

	public Boolean insertMaterialToShipmentMgm(ShipmentVo vo) {
		return sqlSession.insert("shipmentMgm.insertMaterialToShipmentMgm", vo) == 1;
	}
	
	public Boolean insertMaterialToMaterialMgm(ShipmentVo vo) {
		return sqlSession.insert("shipmentMgm.insertMaterialToMaterialMgm", vo) == 1;
	}

	public Boolean updateMaterialToShipmentMgm(ShipmentVo vo) {
		return sqlSession.update("shipmentMgm.updateMaterialToShipmentMgm", vo) == 1;
	}
	
	public Boolean updateMaterialToMaterialMgm(ShipmentVo vo) {
		return sqlSession.update("shipmentMgm.updateMaterialToMaterialMgm", vo) == 1;
	}
	
}
