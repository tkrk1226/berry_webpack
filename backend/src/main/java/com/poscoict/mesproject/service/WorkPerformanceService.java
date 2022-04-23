package com.poscoict.mesproject.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.repository.InstructionRepository;
import com.poscoict.mesproject.repository.QualityRepository;
import com.poscoict.mesproject.repository.WorkPerformanceRepository;
import com.poscoict.mesproject.vo.InstructionVo;
import com.poscoict.mesproject.vo.WorkPerformanceVo;

@Service
public class WorkPerformanceService {
	
	@Autowired
	private InstructionRepository instructionRepository;
	
	@Autowired
	private WorkPerformanceRepository workPerformanceRepository;
	
	@Autowired
	private QualityRepository qualityRepository;
	
	// 품질 테이블 참조, Pass / fail 판단 
	public List<HashMap<String, Object>> getTaskByFactoryAndMaterialNum(String factory, String materialNum) {
		List<HashMap<String, Object>> list = workPerformanceRepository.getTaskByFactoryAndMaterialNum(factory, materialNum);
		
		return list;
	}
	
	// 작업이력 조회 (재료번호, 생산일자, 공장, 작업방식, 최종중량)
	public void insert(List<WorkPerformanceVo> workPerformanceVo) {
		workPerformanceRepository.insert(workPerformanceVo);
	}
	
	
	// 깃 충돌을 방지하기 위해 지정한 영역입니다. 이 경계선을 절대로 절대로 넘지 마세요
		// ----------------------------------------------------------------- -----------------------------------------------------------
		// ----------------------------------------------------------------------------------------------------------------------------------
		// ------------------------------------------------------------------이창주 -----------------------------------------------------------
		
	
	public List<InstructionVo> getAll() {
		List<InstructionVo> list = workPerformanceRepository.getAll();
		return list;
	}

	public List<InstructionVo> getAlldate(WorkPerformanceVo vo) {
		List<InstructionVo> list = workPerformanceRepository.getAlldate(vo);

		return list;
	}
	
	public List<InstructionVo> getAllMachine(WorkPerformanceVo vo) {
		List<InstructionVo> list = workPerformanceRepository.getAllMachine(vo);

		return list;
	}
	
	public List<InstructionVo> getselectfactory(WorkPerformanceVo vo) {
		List<InstructionVo> list = workPerformanceRepository.getselectfactory(vo);
		return list;
	}

	public List<InstructionVo> getselectdate(WorkPerformanceVo vo) {
		List<InstructionVo> list = workPerformanceRepository.getselectdate(vo);
		return list;
	}

//	public List<InstructionVo> getMachine4(WorkPerformanceVo vo) {
//		List<InstructionVo> list = workPerformanceRepository.getMachine4(vo);
//		return list;
//	}
//
//	public List<InstructionVo> getMachine2(WorkPerformanceVo vo) {
//		List<InstructionVo> list = workPerformanceRepository.getMachine2(vo);
//		return list;
//	}
//
//	public List<InstructionVo> getHand(WorkPerformanceVo vo) {
//		List<InstructionVo> list = workPerformanceRepository.getHand(vo);
//		return list;
//	}

	public List<InstructionVo> findSelect(WorkPerformanceVo vo) {
		List<InstructionVo> list = workPerformanceRepository.findSelect(vo);

		return list;
	}

	public List<InstructionVo> getAlldatechart(WorkPerformanceVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<InstructionVo> getAllMachinechart(WorkPerformanceVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<InstructionVo> getselectdatechart(WorkPerformanceVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<InstructionVo> getselectfactorychart(WorkPerformanceVo vo) {
		// TODO Auto-generated method stub
		return null;
	}



	
	
	
}
