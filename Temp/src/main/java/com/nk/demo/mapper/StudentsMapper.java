package com.nk.demo.mapper;

import java.util.List;

import com.nk.demo.pojo.Students;

public interface StudentsMapper {
	
	public List<Students> selectStudents() throws Exception;

}
