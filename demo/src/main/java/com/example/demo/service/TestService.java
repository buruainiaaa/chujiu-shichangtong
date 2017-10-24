package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.TestMapper;
import com.example.demo.model.Test;

@Service
public class TestService {

	@Autowired
	private TestMapper testMapper;
	
	public Test getEntity(){
		return testMapper.selectByPrimaryKey(1);
	}
	
}
