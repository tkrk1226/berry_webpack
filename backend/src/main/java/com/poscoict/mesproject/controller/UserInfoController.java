package com.poscoict.mesproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poscoict.mesproject.dto.JsonResult;
import com.poscoict.mesproject.service.UserInfoService;
import com.poscoict.mesproject.vo.UserInfoVo;

@RestController
@RequestMapping("/api/user/info")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	// 게시판 글 전체 보기
	@GetMapping("")
	public ResponseEntity<JsonResult> viewList(){
		List<UserInfoVo> list = userInfoService.getAll();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(JsonResult.success(list));
	}
	
	
}
