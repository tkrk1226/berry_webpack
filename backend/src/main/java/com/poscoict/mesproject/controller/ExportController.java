package com.poscoict.mesproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poscoict.mesproject.dto.JsonResult;
import com.poscoict.mesproject.service.ExportService;
import com.poscoict.mesproject.vo.ExportVo;

@RestController
@RequestMapping("api/export")
public class ExportController {

	@Autowired
	private ExportService exportService;
	
	// 입고된 재료정보 조회(검색 포함)
	@GetMapping("/view")
	public ResponseEntity<?> viewMaterials() {
		List<ExportVo> list = exportService.getMaterials(); 
		return ResponseEntity.ok().body(JsonResult.success(list));
	}
	
	// 상차 등록 시 고객사, 차량번호 업데이트
	@PostMapping("/update/delivery")
	public ResponseEntity<?> updateDeliveryCode(@RequestBody ExportVo vo) {
		System.out.println(vo + " from Controller");
		exportService.updateDeliveryCode(vo);
		return ResponseEntity.ok().body(JsonResult.success(true));
	}
	
	// 출하 처리 시 진도코드, 상태코드 업데이트
	@PostMapping("/update/code")
	public ResponseEntity<?> updateStateCode(@RequestBody ExportVo vo) {
		System.out.println(vo.getMaterialNumber() + " from code");
		exportService.updateStateCode(vo.getMaterialNumber());
		return ResponseEntity.ok().body(JsonResult.success(true));
	}
	
}
