package com.nk.demo.service;

import java.util.List;

import com.nk.demo.pojo.Projects;
import com.nk.demo.vo.ProjectSearchVO;
import com.nk.demo.vo.UpdateProjectFlagVO;

public interface ProjectService {
	
	public List<Projects> selectProjectListByCondition(ProjectSearchVO vo) throws Exception;
	
	public void updateProjectFlag(UpdateProjectFlagVO vo) throws Exception;
	
	public int selectProjectTotalCount(ProjectSearchVO vo) throws Exception;
	
	public Projects selectProjectByID(int projid) throws Exception;

}
