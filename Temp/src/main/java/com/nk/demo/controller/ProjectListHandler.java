package com.nk.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nk.demo.pojo.Depts;
import com.nk.demo.pojo.Projects;
import com.nk.demo.service.DeptService;
import com.nk.demo.service.ProjectService;
import com.nk.demo.util.ConstantValue;
import com.nk.demo.vo.ProjectSearchVO;
import com.nk.demo.vo.UpdateProjectFlagVO;

@Controller
public class ProjectListHandler {
	
	@Autowired
	private ProjectService ps;
	
	@Autowired
	private DeptService ds;
	
	@RequestMapping(value="/projects.action")
	public String getProjectList(ProjectSearchVO vo, Model m) throws Exception{
		//voµÄ×é×°
//		ProjectSearchVO vo = new ProjectSearchVO();
//		vo.setProjid(projid);
//		vo.setPname(pname);	
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		if(beginDate != null && !beginDate.isEmpty()){
//			Date b = sdf.parse(beginDate);
//			vo.setBeginDate(b);
//		}
//		if(endDate != null && !endDate.isEmpty()){
//			Date e = sdf.parse(endDate);
//			vo.setEndDate(e);
//		}

		List<Projects> list = ps.selectProjectListByCondition(vo);
		int total = ps.selectProjectTotalCount(vo);
		int maxpage = (total % ConstantValue.PAGE_COUNT == 0) ? (total / ConstantValue.PAGE_COUNT) : (total / ConstantValue.PAGE_COUNT + 1); 
		vo.setTotalCount(total);
		vo.setMaxpage(maxpage);

		m.addAttribute("plist", list);
		m.addAttribute("svo", vo);
		return "forward:/jsp/projects.jsp";
	}
	
	@RequestMapping(value="/updateProjectFlag.action")
	public String deleteProject(UpdateProjectFlagVO vo){
		try {
			ps.updateProjectFlag(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/projects.action";		
	}
	
	@RequestMapping(value="/entryUpdateProject.action")
	public String entryModifyProject(Integer projid, Model m) throws Exception{
		Projects p = null;
		if(projid != null){
			p = ps.selectProjectByID(projid);
		}
		List<Depts> list = ds.selectExistDeptList();
		m.addAttribute("project", p);
		m.addAttribute("dlist", list);
		return "forward:/jsp/updateProject.jsp";	
	}

}
