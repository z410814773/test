package com.nk.demo.service;

import java.util.List;

import com.nk.demo.pojo.Depts;

public interface DeptService {
	
	public List<Depts> selectExistDeptList() throws Exception;

}
