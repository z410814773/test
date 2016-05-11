package com.nk.demo.mapper;

import java.util.List;

import com.nk.demo.pojo.Projects;
import com.nk.demo.vo.ProjectSearchVO;
import com.nk.demo.vo.UpdateProjectFlagVO;

public interface ProjectsMapper {
	
	public List<Projects> selectProjectsByCondition(ProjectSearchVO vo);
	
	public void updateProjectFlagByID(UpdateProjectFlagVO vo);
	
	public int selectProjectTotalCount(ProjectSearchVO vo);
	
	public Projects selectProjectByID(int projid);

}
