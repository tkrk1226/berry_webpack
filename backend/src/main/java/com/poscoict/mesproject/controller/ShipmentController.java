package com.poscoict.mesproject.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poscoict.mesproject.dto.JsonResult;
import com.poscoict.mesproject.service.ShipmentService;
import com.poscoict.mesproject.vo.ShipmentVo;

@RestController
@RequestMapping("/api/shipment")
public class ShipmentController {
	
	@Autowired
	private ShipmentService shipmentService;
	
	@GetMapping("")
	public ResponseEntity<JsonResult> getMaterialsListByDates(
			@RequestParam(value="startDate", required = true, defaultValue="") String startDate, 
			@RequestParam(value="endDate", required = true, defaultValue="") String endDate){
		List<Map<String,Object>> list = null;

		list = shipmentService.getMaterialsList(startDate, endDate);
		
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(JsonResult.success(list));
	}
	
	@PostMapping("/insert/material") 
	public ResponseEntity<JsonResult> registerMaterial(@RequestBody ShipmentVo vo) {
		shipmentService.registerMaterial(vo);
		
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(JsonResult.success(vo));
	}
	
	@PostMapping("/insert/excel") 
	public ResponseEntity<JsonResult> registerExcel(@RequestBody List<ShipmentVo> list) {
		
		shipmentService.registerExcel(list);
		
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(JsonResult.success(list));
	}
	
	@PutMapping("/update")
	public ResponseEntity<JsonResult> updateCheckedMaterials(@RequestBody List<ShipmentVo> list){
		
		shipmentService.updateMaterialList(list);
		
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(JsonResult.success(list));
	}
	
}
