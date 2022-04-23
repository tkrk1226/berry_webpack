package com.poscoict.mesproject.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.poscoict.mesproject.vo.InstructionVo;
import com.poscoict.mesproject.vo.ShipmentVo;

@Repository
public class InstructionRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	// 검색 조건에 맞는 입고된 재료를 조회한다.
	public List<ShipmentVo> findMaterials(String keyword){
		List<ShipmentVo> list=sqlSession.selectList("instructionHistory.findMaterials", keyword);
		return list;			
	}
	
	// 최근에 작업 지시한 정보를 가져온다.
	public InstructionVo findRecentInstruction(String machine){
		InstructionVo instructionVo=sqlSession.selectOne("instructionHistory.findRecentInstruction", machine);
		return instructionVo;			

	}
	
	// 공장당 작업지시 순서 정보를 가져온다.
	public InstructionVo findFactorialSequence(String factory, String materialNumber){
		Map<String, Object> map = new HashMap<>();
		map.put("factory", factory);
		map.put("materialNumber", materialNumber);
		InstructionVo instructionVo=sqlSession.selectOne("instructionHistory.findFactorialSequence", map);
		return instructionVo;			
	}
	
	// 재료번호 작업지시를 등록
	public boolean insertMaterial(InstructionVo instructionVo){
		int cnt=sqlSession.insert("instructionHistory.insertMaterial", instructionVo);
		return cnt==1;			
	}
	
	// 작업지시 등록된 재료번호 진도코드, 상태코드 업데이트
	public boolean updateMaterialCode(String materialNumber){
		int cnt=sqlSession.update("instructionHistory.updateMaterialCode", materialNumber);
		return cnt==1;			
	}
	
	// 깃 충돌을 방지하기 위해 지정한 영역입니다. 이 경계선을 절대로 절대로 넘지 마세요
	// ----------------------------------------------------------------- 하진수 -----------------------------------------------------------
	// ----------------------------------------------------------------------------------------------------------------------------------
	// ------------------------------------------------------------------이창주 -----------------------------------------------------------
	
	public List<InstructionVo> findAll() {
		List<InstructionVo> list = sqlSession.selectList("instructionHistory.findAll");
		return list;
	}

	public List<InstructionVo> findSelect(InstructionVo vo) {
		List<InstructionVo> list = sqlSession.selectList("instructionHistory.findSelect", vo);

		return list;
	}

	public List<InstructionVo> getAlldate(InstructionVo vo) {
		List<InstructionVo> list = sqlSession.selectList("instructionHistory.getAlldate", vo);
		return list;
	}
	
	public List<InstructionVo> getAllMachine(InstructionVo vo) {
		List<InstructionVo> list = sqlSession.selectList("instructionHistory.getAllMachine", vo);
		return list;
	}

	public List<InstructionVo> getselectdate(InstructionVo vo) {
		List<InstructionVo> list = sqlSession.selectList("instructionHistory.getselectdate", vo);
		return list;
	}

	public List<InstructionVo> getselectfactory(InstructionVo vo) {
		List<InstructionVo> list = sqlSession.selectList("instructionHistory.getselectfactory", vo);
		return list;
	}
	
	
//	public List<InstructionVo> getMachine4(InstructionVo vo) {
//		List<InstructionVo> list = sqlSession.selectList("instructionHistory.getMachine4", vo);
//		return list;
//	}
//
//	public List<InstructionVo> getMachine2(InstructionVo vo) {
//		List<InstructionVo> list = sqlSession.selectList("instructionHistory.getMachine2", vo);
//		return list;
//	}
//
//	public List<InstructionVo> getHand(InstructionVo vo) {
//		List<InstructionVo> list = sqlSession.selectList("instructionHistory.getHand", vo);
//		return list;
//	}



	
	
	

}
