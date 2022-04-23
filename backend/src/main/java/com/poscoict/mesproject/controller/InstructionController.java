package com.poscoict.mesproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poscoict.mesproject.dto.JsonResult;
import com.poscoict.mesproject.service.InstructionService;
import com.poscoict.mesproject.vo.InstructionVo;
import com.poscoict.mesproject.vo.ShipmentVo;

@RestController
@RequestMapping("api/instruction")
public class InstructionController {
	
	@Autowired
	private InstructionService instructionService;
	
	// 입고된 재료정보 조회(검색 포함)
	@GetMapping("/receiving")
	public ResponseEntity<?> viewMaterials(@RequestParam(value="keyword", required=true, defaultValue="") String keyword) {
		List<ShipmentVo> list = instructionService.getMaterials(keyword); // 검색 값이 비어 있을 경우 전체 조회
		return ResponseEntity.ok().body(JsonResult.success(list));
	}

	// 최근에 지시한 이력 조회
	@GetMapping("/recent")
	public ResponseEntity<?> getInstructionInfo() {
		List<InstructionVo> list = instructionService.getInstructionInfo(); // 검색 값이 비어 있을 경우 전체 조회
		return ResponseEntity.ok().body(JsonResult.success(list));
	}
	
	// 작덥 등록 테이블에 있는 재료 작업 지시하기
	@PostMapping("/enroll")
	public ResponseEntity<?> enrollMaterialDatas(@RequestBody List<InstructionVo> list) {
		boolean result = instructionService.enrollMaterialDatas(list);
		return ResponseEntity.ok().body(JsonResult.success(result));
	}
	
	// 작업 등록에 필요한 재료 데이터 가져오기
	@GetMapping("/sequence")
	public ResponseEntity<?> getFactorialSequence(
			@RequestParam(value="factory", required=true, defaultValue="") String factory,
			@RequestParam(value="materialNumber", required=true, defaultValue="") String materialNumber) {
		
			InstructionVo instructionVo = instructionService.getFactorialSequence(factory, materialNumber);
			return ResponseEntity.ok().body(JsonResult.success(instructionVo));
	}
	
	
	// 깃 충돌을 방지하기 위해 지정한 영역입니다. 이 경계선을 절대로 절대로 넘지 마세요
	// ----------------------------------------------------------------- 하진수 -----------------------------------------------------------
	// ----------------------------------------------------------------------------------------------------------------------------------
	// ------------------------------------------------------------------이창주 -----------------------------------------------------------
	
	
	// 게시판 글 전체 보기
		@GetMapping("")
		public ResponseEntity<JsonResult> viewList(){
			List<InstructionVo> list = instructionService.getAll();
			System.out.println("여기는 getMapping===========");
			System.out.println("여기는 getMapping list :" + list);
			System.out.println("여기는 getMapping===========");

			return ResponseEntity
					.status(HttpStatus.OK)
					.body(JsonResult.success(list));
		}
		
		@PostMapping("/select")
		public ResponseEntity<JsonResult> viewList2(@RequestBody InstructionVo vo){
			
			System.out.println("===factory===");
			if(( ( (vo.getFactory().isEmpty() && vo.getFactory() == "" ) && (vo.getWorkinstdateStart().isEmpty() && vo.getWorkinstdateEnd().isEmpty() )  ) || 
					((vo.getFactory().equals("all")) && (vo.getWorkinstdateStart().isEmpty() && vo.getWorkinstdateEnd().isEmpty()))  )) {
				System.out.println("factory가 빈 것일 때");
				System.out.println(vo.getFactory());
				List<InstructionVo> list = instructionService.getAllMachine(vo);

				return ResponseEntity
						.status(HttpStatus.OK)
						.body(JsonResult.success(list));
			}
			
			if( ( ( (vo.getFactory().isEmpty() && vo.getFactory() == "" ) && (!vo.getWorkinstdateStart().isEmpty() && !vo.getWorkinstdateEnd().isEmpty() )  ) || 
					((vo.getFactory().equals("all")) && (!vo.getWorkinstdateStart().isEmpty() && !vo.getWorkinstdateEnd().isEmpty())) )){
				
				System.out.println("factory가 빈 것일 때 날짜는 있다.");
				System.out.println(vo.getFactory());
				List<InstructionVo> list = instructionService.getAlldate(vo);

				return ResponseEntity
						.status(HttpStatus.OK)
						.body(JsonResult.success(list));
			}
			
			
			if((vo.getFactory().equals("4면 Machine") && (!vo.getWorkinstdateStart().isEmpty() && !vo.getWorkinstdateEnd().isEmpty() ) )|| 
					(vo.getFactory().equals("2면 Machine") && (!vo.getWorkinstdateStart().isEmpty() && !vo.getWorkinstdateEnd().isEmpty() ) )|| 
					(vo.getFactory().equals("Hand Machine") && (!vo.getWorkinstdateStart().isEmpty() && !vo.getWorkinstdateEnd().isEmpty() ) ) ) {
							System.out.println("4면 Machine");
							System.out.println(vo);
							System.out.println(vo.getWorkinstdateEnd());
							
							
							List<InstructionVo> list = instructionService.getselectdate(vo);
							
							System.out.println(list);
							System.out.println("=-=======================");
							return ResponseEntity
									.status(HttpStatus.OK)
									.body(JsonResult.success(list));
						}
			
			if((vo.getFactory().equals("4면 Machine") && (vo.getWorkinstdateStart().isEmpty() && vo.getWorkinstdateEnd().isEmpty() ) )|| 
					(vo.getFactory().equals("2면 Machine") && (vo.getWorkinstdateStart().isEmpty() && vo.getWorkinstdateEnd().isEmpty() ) )|| 
					(vo.getFactory().equals("Hand Machine") && (vo.getWorkinstdateStart().isEmpty() && vo.getWorkinstdateEnd().isEmpty() ) ) ) {
							System.out.println("4면 Machine");
							System.out.println(vo);
							System.out.println(vo.getWorkinstdateEnd());
							
							
							List<InstructionVo> list = instructionService.getselectfactory(vo);
							
							System.out.println(list);
							System.out.println("=-=======================");
							return ResponseEntity
									.status(HttpStatus.OK)
									.body(JsonResult.success(list));
						}
			
//			if(vo.getFactory().equals("2면 Machine")) {
//							System.out.println("2면 Machine");
//							System.out.println(vo);
//			
//							List<InstructionVo> list = instructionService.getMachine2(vo);
//							
//							System.out.println(list);
//							return ResponseEntity
//									.status(HttpStatus.OK)
//									.body(JsonResult.success(list));
//						}
//			
//			if(vo.getFactory().equals("Hand Machine")) {
//							System.out.println("Hand Machine");
//							System.out.println(vo);
//			
//							
//							List<InstructionVo> list = instructionService.getHand(vo);
//							System.out.println(list);
//							
//							System.out.println(list);
//							return ResponseEntity
//									.status(HttpStatus.OK)
//									.body(JsonResult.success(list));
//						}
//			
			
//			System.out.println(vo.getFactory());
			System.out.println("===factory===");
			
			System.out.println("======vo======");
			System.out.println(vo);
			System.out.println("======vo======");
			List<InstructionVo> list = instructionService.findSelect(vo);
			

			
			return ResponseEntity
					.status(HttpStatus.OK)
					.body(JsonResult.success(list));
		}
		
		
	
	
}
