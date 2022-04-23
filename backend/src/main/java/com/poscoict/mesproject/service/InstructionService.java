package com.poscoict.mesproject.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poscoict.mesproject.repository.InstructionRepository;
import com.poscoict.mesproject.vo.InstructionVo;
import com.poscoict.mesproject.vo.ShipmentVo;

@Service
public class InstructionService {
	
	@Autowired
	private InstructionRepository instructionRepository;
	
	// 검색조건에 맞는 입고된 재료 정보 얻기
	public List<ShipmentVo>  getMaterials(String keyword) {
		List<ShipmentVo> list=instructionRepository.findMaterials(keyword);
		return list;
	}
	
	// 최근에 작업 지시한 정보를 가져온다.(4면 Machine, 2면 Machine, Hand Machine)
	public List<InstructionVo> getInstructionInfo(){
		List<String> machineList = new ArrayList<String>(Arrays.asList("2면 Machine","4면 Machine","Hand Machine"));
		List<InstructionVo> instructionList = new ArrayList<InstructionVo>();
		for(String machine : machineList) {
			InstructionVo machineInfo =instructionRepository.findRecentInstruction(machine);
			instructionList.add(machineInfo);
		}
		return instructionList;			
	}
	
	// 공장당 작업지시 순서 정보를 가져온다.
	public InstructionVo getFactorialSequence(String factory,  String materialNumber){
		InstructionVo instructionVo=instructionRepository.findFactorialSequence(factory, materialNumber);
		return instructionVo;			
	}
	
	// 작업지시된 재료번호 등록 후 진도코드, 상태코드 업데이트
	@Transactional
	public boolean enrollMaterialDatas(List<InstructionVo> list){
		for(InstructionVo instructionVo : list) {
			instructionVo.setDueDate(instructionVo.getDueDate().replaceAll("T", " "));
			instructionRepository.insertMaterial(instructionVo);
			instructionRepository.updateMaterialCode(instructionVo.getMaterialNumber());
		}
		return true;			
	}
	
	
	// 깃 충돌을 방지하기 위해 지정한 영역입니다. 이 경계선을 절대로 절대로 넘지 마세요
	// ----------------------------------------------------------------- 하진수 -----------------------------------------------------------
	// ----------------------------------------------------------------------------------------------------------------------------------
	// ------------------------------------------------------------------이창주 -----------------------------------------------------------
	
	public List<InstructionVo> getAll() {
		List<InstructionVo> list = instructionRepository.findAll();
		return list;
	}

	public List<InstructionVo> findSelect(InstructionVo vo) {
		List<InstructionVo> list = instructionRepository.findSelect(vo);

		return list;
	}

	public List<InstructionVo> getAllMachine(InstructionVo vo) {
		List<InstructionVo> list = instructionRepository.getAllMachine(vo);

		return list;
	}
	
	public List<InstructionVo> getAlldate(InstructionVo vo) {
		List<InstructionVo> list = instructionRepository.getAlldate(vo);
		return list;
	}
	
	public List<InstructionVo> getselectdate(InstructionVo vo) {
		List<InstructionVo> list = instructionRepository.getselectdate(vo);
		return list;
	}

	public List<InstructionVo> getselectfactory(InstructionVo vo) {
		List<InstructionVo> list = instructionRepository.getselectfactory(vo);
		return list;
	}


//	public List<InstructionVo> getMachine4(InstructionVo vo) {
//		List<InstructionVo> list = instructionRepository.getMachine4(vo);
//		return list;
//	}
//
//	public List<InstructionVo> getMachine2(InstructionVo vo) {
//		List<InstructionVo> list = instructionRepository.getMachine2(vo);
//		return list;
//	}
//
//	public List<InstructionVo> getHand(InstructionVo vo) {
//		List<InstructionVo> list = instructionRepository.getHand(vo);
//		return list;
//	}
//	public List<InstructionVo> getselect(InstructionVo vo) {
//		// TODO Auto-generated method stub
//		return null;
//	}




}
