package com.nk.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nk.demo.mapper.DeptsMapper;
import com.nk.demo.pojo.Depts;
import com.nk.demo.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	private DeptsMapper dm;

	public List<Depts> selectExistDeptList() throws Exception {
		// TODO Auto-generated method stub
		return dm.selectExistDeptList();
	}

}
