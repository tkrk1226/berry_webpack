package com.poscoict.mesproject.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.poscoict.mesproject.vo.ExportVo;

@Repository
public class ExportRepository {

	@Autowired
	private SqlSession sqlSession;
	
	// 검색 조건에 맞는 입고된 재료를 조회한다.
	public List<ExportVo> findMaterials(){
		List<ExportVo> list=sqlSession.selectList("export.findMaterials");
		return list;			
	}
	
	// 상차 등록 시 고객사, 차량번호 업데이트
	public boolean updateDelivery(ExportVo vo){
		System.out.println(vo + " from Repository");
		return sqlSession.update("export.updateDelivery", vo) == 1; 			
	}
	
	// 출하 처리 시 재료번호 진도코드, 상태코드 업데이트
	public boolean updateStateCode(String materialNumber){
		System.out.println(materialNumber + " from Repository");
		return sqlSession.update("export.updateStateCode", materialNumber) == 1;		
	}
	
}
