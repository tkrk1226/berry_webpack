package com.poscoict.mesproject.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poscoict.mesproject.vo.UserInfoVo;

@Service
public class UserInfoRepository {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<UserInfoVo> findAll() {
		List<UserInfoVo> list = sqlSession.selectList("userInfo.findAll");
		return list;
	}

}
