package com.poscoict.mesproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.repository.UserInfoRepository;
import com.poscoict.mesproject.vo.UserInfoVo;

@Service
public class UserInfoService {
	
	@Autowired
	private UserInfoRepository userInfoRepository;
	
	public List<UserInfoVo> getAll() {
		List<UserInfoVo> list = userInfoRepository.findAll();
		return list;
	}

}
