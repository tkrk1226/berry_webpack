package com.poscoict.mesproject.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.poscoict.mesproject.vo.InstructionVo;
import com.poscoict.mesproject.vo.WorkPerformanceVo;

@Repository
public class WorkPerformanceRepository {
	
	@Autowired
	private SqlSession sqlSession;

	public List<HashMap<String, Object>> getTaskByFactoryAndMaterialNum(String factory, String materialNum) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("factory", factory);
		map.put("materialNum", materialNum);
		
		return sqlSession.selectList("workHistory.getTaskByFactoryAndMaterialNum", map);
	}

	public int insert(List<WorkPerformanceVo> list) {
		
		System.out.println("-----" + list);
		
		return sqlSession.insert("workHistory.insert", list);
		
	}

	
	
	
	// 깃 충돌을 방지하기 위해 지정한 영역입니다. 이 경계선을 절대로 절대로 넘지 마세요
	// ----------------------------------------------------------------- -----------------------------------------------------------
	// ----------------------------------------------------------------------------------------------------------------------------------
	// ------------------------------------------------------------------이창주 -----------------------------------------------------------
	
	
	public List<InstructionVo> getAll() {
		List<InstructionVo> list = sqlSession.selectList("workHistory.getAll");
		return list;
	}

	public List<InstructionVo> getAlldate(WorkPerformanceVo vo) {
		List<InstructionVo> list = sqlSession.selectList("workHistory.getAlldate", vo);
		return list;
	}
	
	public List<InstructionVo> getAllMachine(WorkPerformanceVo vo) {
		List<InstructionVo> list = sqlSession.selectList("workHistory.getAllMachine", vo);
		return list;
	}

	public List<InstructionVo> getselectfactory(WorkPerformanceVo vo) {
		List<InstructionVo> list = sqlSession.selectList("workHistory.getselectfactory", vo);
		return list;
	}

	public List<InstructionVo> getselectdate(WorkPerformanceVo vo) {
		List<InstructionVo> list = sqlSession.selectList("workHistory.getselectdate", vo);
		return list;
	}

//	public List<InstructionVo> getMachine4(WorkPerformanceVo vo) {
//		List<InstructionVo> list = sqlSession.selectList("workHistory.getMachine4", vo);
//		return list;
//	}
//
//	public List<InstructionVo> getMachine2(WorkPerformanceVo vo) {
//		List<InstructionVo> list = sqlSession.selectList("workHistory.getMachine2", vo);
//		return list;
//	}
//
//	public List<InstructionVo> getHand(WorkPerformanceVo vo) {
//		List<InstructionVo> list = sqlSession.selectList("workHistory.getHand", vo);
//		return list;
//	}

	public List<InstructionVo> findSelect(WorkPerformanceVo vo) {
		List<InstructionVo> list = sqlSession.selectList("workHistory.findSelect", vo);

		return list;
	}


	
	
	
}
