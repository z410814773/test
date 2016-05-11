package com.nk.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nk.demo.mapper.ProjectsMapper;
import com.nk.demo.pojo.Projects;
import com.nk.demo.service.ProjectService;
import com.nk.demo.vo.ProjectSearchVO;
import com.nk.demo.vo.UpdateProjectFlagVO;

@Service
public class ProjectServiceImpl implements ProjectService {
	
	@Autowired
	private ProjectsMapper pm;

	public List<Projects> selectProjectListByCondition(ProjectSearchVO vo)
			throws Exception {
		if(vo.getPagenum() == null || vo.getPagenum() <= 0){
			vo.setPagenum(1);
		}
		vo.setStartIndex((vo.getPagenum() - 1) * vo.getPagecount());
		return pm.selectProjectsByCondition(vo);
	}

	public void updateProjectFlag(UpdateProjectFlagVO vo) throws Exception {
		pm.updateProjectFlagByID(vo);
		int i = 1 / 0;
		return;
	}

	public int selectProjectTotalCount(ProjectSearchVO vo) throws Exception {
		// TODO Auto-generated method stub
		return pm.selectProjectTotalCount(vo);
	}

	public Projects selectProjectByID(int projid) throws Exception {
		// TODO Auto-generated method stub
		return pm.selectProjectByID(projid);
	}

}
