package com.nk.demo.service;

import java.util.List;

import com.nk.demo.pojo.Students;

public interface StudentService {
	
	public List<Students> selectStudentList() throws Exception;

}
