package com.nk.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nk.demo.pojo.Students;
import com.nk.demo.service.StudentService;

@Controller
public class StudentsListHandler {
	
	@Autowired
	private StudentService ss;
	
	@RequestMapping(value="/students.action")
	public String getStudentList(Model m) throws Exception{
		List<Students> list = ss.selectStudentList();
		m.addAttribute("slist", list);
		return "forward:/jsp/students.jsp";
	}

}
