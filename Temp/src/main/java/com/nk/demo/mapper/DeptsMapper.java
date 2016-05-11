package com.nk.demo.mapper;

import java.util.List;

import com.nk.demo.pojo.Depts;

public interface DeptsMapper {
	
	public Depts selectDeptByID(int id) throws Exception;
	
	public List<Depts> selectExistDeptList() throws Exception;

}
