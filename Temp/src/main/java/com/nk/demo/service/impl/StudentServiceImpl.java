package com.nk.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nk.demo.mapper.StudentsMapper;
import com.nk.demo.pojo.Students;
import com.nk.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentsMapper studentsMapper;
	
	public List<Students> selectStudentList() throws Exception {
		// TODO Auto-generated method stub
		return studentsMapper.selectStudents();
	}
	

}
