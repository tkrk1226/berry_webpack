package com.poscoict.mesproject.controller;

import java.util.HashMap;
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
import com.poscoict.mesproject.service.WorkPerformanceService;
import com.poscoict.mesproject.vo.InstructionVo;
import com.poscoict.mesproject.vo.WorkPerformanceVo;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@RestController
@RequestMapping("/api/workperformance")
public class WorkPerformanceController {
	
	@Autowired
	private WorkPerformanceService workPerformanceService;
	
	// 조회 기능 (품질측정) 
	@GetMapping("/lookUp")
	public ResponseEntity<JsonResult> viewList(@RequestParam(value="factory", required = true, defaultValue = "") String factory, 
			@RequestParam(value="materialNum", required = true, defaultValue = "") String materialNum){
		System.out.println(factory);
		List<HashMap<String, Object>> list = workPerformanceService.getTaskByFactoryAndMaterialNum(factory, materialNum);
		System.out.println(list);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(JsonResult.success(list));
	}
	
	@PostMapping("/register")
	public ResponseEntity<JsonResult> addTask(@RequestBody List<WorkPerformanceVo> list) {
		System.out.println("-------------------" + list);
		
		workPerformanceService.insert(list);
		
		
		
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(JsonResult.success(list));
	}
	
	
	// 깃 충돌을 방지하기 위해 지정한 영역입니다. 이 경계선을 절대로 절대로 넘지 마세요
		// ----------------------------------------------------------------- -----------------------------------------------------------
		// ----------------------------------------------------------------------------------------------------------------------------------
		// ------------------------------------------------------------------이창주 -----------------------------------------------------------
		
		
		// 게시판 글 전체 보기
			@GetMapping("")
			public ResponseEntity<JsonResult> viewList(){
				List<InstructionVo> list = workPerformanceService.getAll();
				System.out.println("여기는 getMapping===========");
				System.out.println("여기는 getMapping list :" + list);
				
				System.out.println("여기는 getMapping===========");

				return ResponseEntity
						.status(HttpStatus.OK)
						.body(JsonResult.success(list));
			}
		
			// 게시판 글 전체 보기
			@PostMapping("/select")
			public ResponseEntity<JsonResult> viewList2(@RequestBody WorkPerformanceVo vo){
				System.out.println("===factory===");
				if( ( (vo.getFactory().isEmpty() && vo.getFactory().equals("") ) || vo.getFactory().equals("all") ) &&
					  (!vo.getWorkinstdateStart().isEmpty() && !vo.getWorkinstdateEnd().isEmpty() ) ) {
					System.out.println("factory가 빈 것일 때");
					System.out.println(vo.getFactory());
					System.out.println(vo);

					List<InstructionVo> list = workPerformanceService.getAlldate(vo);

					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println(list);
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					
					
					return ResponseEntity
							.status(HttpStatus.OK)
							.body(JsonResult.success(list));
				}
				
				if( ( (vo.getFactory().isEmpty() && vo.getFactory().equals("") )|| vo.getFactory().equals("all") ) && 
					  (vo.getWorkinstdateStart().isEmpty() && vo.getWorkinstdateEnd().isEmpty() ) ) {
					System.out.println("factory가 빈 것일 때 날짜는 안들어가 있다.");
					System.out.println(vo.getFactory());
					System.out.println(vo);

					List<InstructionVo> list = workPerformanceService.getAllMachine(vo);

					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println(list);
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					
					
					return ResponseEntity
							.status(HttpStatus.OK)
							.body(JsonResult.success(list));
				}
				
				if((vo.getFactory().equals("4면 Machine") && (!vo.getWorkinstdateStart().isEmpty() && !vo.getWorkinstdateEnd().isEmpty() ) )|| 
						(vo.getFactory().equals("2면 Machine") && (!vo.getWorkinstdateStart().isEmpty() && !vo.getWorkinstdateEnd().isEmpty() ) )|| 
						(vo.getFactory().equals("Hand Machine") && (!vo.getWorkinstdateStart().isEmpty() && !vo.getWorkinstdateEnd().isEmpty() ) ) ) {

					System.out.println(vo.getFactory());
					System.out.println(vo);

					List<InstructionVo> list = workPerformanceService.getselectdate(vo);
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println(list);
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					
					return ResponseEntity
							.status(HttpStatus.OK)
							.body(JsonResult.success(list));
				}
				
				if((vo.getFactory().equals("4면 Machine") && (vo.getWorkinstdateStart().isEmpty() && vo.getWorkinstdateEnd().isEmpty() ) ) || 
						
						(vo.getFactory().equals("2면 Machine") && (vo.getWorkinstdateStart().isEmpty() && vo.getWorkinstdateEnd().isEmpty() ) )|| 
						
						(vo.getFactory().equals("Hand Machine") && (vo.getWorkinstdateStart().isEmpty() && vo.getWorkinstdateEnd().isEmpty() ) ) ) {

					System.out.println(vo.getFactory());
					System.out.println(vo);

					List<InstructionVo> list = workPerformanceService.getselectfactory(vo);
					
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println(list);
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					
					return ResponseEntity
							.status(HttpStatus.OK)
							.body(JsonResult.success(list));
				}


				System.out.println("===factory===");
				
				System.out.println("======vo======");
				System.out.println(vo);
				System.out.println("======vo======");
				List<InstructionVo> list = workPerformanceService.findSelect(vo);
				

				
				return ResponseEntity
						.status(HttpStatus.OK)
						.body(JsonResult.success(list));
			}
			
			
			@PostMapping("/chart")
			public ResponseEntity<JsonResult> viewList3(@RequestBody WorkPerformanceVo vo){
				System.out.println("===factory===");
				if( ( (vo.getFactory().isEmpty() && vo.getFactory().equals("") ) || vo.getFactory().equals("all") ) &&
					  (!vo.getWorkinstdateStart().isEmpty() && !vo.getWorkinstdateEnd().isEmpty() ) ) {
					System.out.println("factory가 빈 것일 때");
					System.out.println(vo.getFactory());
					System.out.println(vo);

					List<InstructionVo> list = workPerformanceService.getAlldatechart(vo);

					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println(list);
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					
					
					return ResponseEntity
							.status(HttpStatus.OK)
							.body(JsonResult.success(list));
				}
				
				if( ( (vo.getFactory().isEmpty() && vo.getFactory().equals("") )|| vo.getFactory().equals("all") ) && 
					  (vo.getWorkinstdateStart().isEmpty() && vo.getWorkinstdateEnd().isEmpty() ) ) {
					System.out.println("factory가 빈 것일 때");
					System.out.println(vo.getFactory());
					System.out.println(vo);

					List<InstructionVo> list = workPerformanceService.getAllMachinechart(vo);

					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println(list);
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					
					
					return ResponseEntity
							.status(HttpStatus.OK)
							.body(JsonResult.success(list));
				}
				
				if((vo.getFactory().equals("4면 Machine") && (!vo.getWorkinstdateStart().isEmpty() && !vo.getWorkinstdateEnd().isEmpty() ) )|| 
						(vo.getFactory().equals("2면 Machine") && (!vo.getWorkinstdateStart().isEmpty() && !vo.getWorkinstdateEnd().isEmpty() ) )|| 
						(vo.getFactory().equals("Hand Machine") && (!vo.getWorkinstdateStart().isEmpty() && !vo.getWorkinstdateEnd().isEmpty() ) ) ) {

					System.out.println(vo.getFactory());
					System.out.println(vo);

					List<InstructionVo> list = workPerformanceService.getselectdatechart(vo);
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println(list);

					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					
					return ResponseEntity
							.status(HttpStatus.OK)
							.body(JsonResult.success(list));
				}
				
				if((vo.getFactory().equals("4면 Machine") && (vo.getWorkinstdateStart().isEmpty() && vo.getWorkinstdateEnd().isEmpty() ) ) || 
						
						(vo.getFactory().equals("2면 Machine") && (vo.getWorkinstdateStart().isEmpty() && vo.getWorkinstdateEnd().isEmpty() ) )|| 
						
						(vo.getFactory().equals("Hand Machine") && (vo.getWorkinstdateStart().isEmpty() && vo.getWorkinstdateEnd().isEmpty() ) ) ) {

					System.out.println(vo.getFactory());
					System.out.println(vo);

					List<InstructionVo> list = workPerformanceService.getselectfactorychart(vo);
					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					System.out.println(list);

					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
					
					return ResponseEntity
							.status(HttpStatus.OK)
							.body(JsonResult.success(list));
				}

//				if(vo.getFactory().equals("2면 Machine")) {
//					System.out.println("2면 Machine");
//					System.out.println(vo.getFactory());
//					System.out.println(vo);
//
//					List<InstructionVo> list = workPerformanceService.getMachine2(vo);
//					
//					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//					System.out.println(list);
//					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//					
//					return ResponseEntity
//							.status(HttpStatus.OK)
//							.body(JsonResult.success(list));
//				}
//
//				if(vo.getFactory().equals("Hand Machine")) {
//					System.out.println("Hand Machine");
//					System.out.println(vo.getFactory());
//					System.out.println(vo);
//
//					List<InstructionVo> list = workPerformanceService.getHand(vo);
//					
//					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//					System.out.println(list);
//					System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//					
//					return ResponseEntity
//							.status(HttpStatus.OK)
//							.body(JsonResult.success(list));
//				}
//				
				
//				System.out.println(vo.getFactory());
				System.out.println("===factory===");
				
				System.out.println("======vo======");
				System.out.println(vo);
				System.out.println("======vo======");
				List<InstructionVo> list = workPerformanceService.findSelect(vo);
				

				
				return ResponseEntity
						.status(HttpStatus.OK)
						.body(JsonResult.success(list));
			}
			
			
}
