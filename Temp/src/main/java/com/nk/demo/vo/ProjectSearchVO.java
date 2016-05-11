package com.nk.demo.vo;

import java.util.Date;

import com.nk.demo.util.ConstantValue;

public class ProjectSearchVO {
	
	private Integer projid;
	
	private String pname;
	
	private Date beginDate;
	
	private Date endDate;
	
	//页码
	private Integer pagenum;
	
	//数据库查询的起始下标
	private Integer startIndex;
	
	//每页查询几个
	private Integer pagecount = ConstantValue.PAGE_COUNT;
	
	//总条目数
	private Integer totalCount;
	
	//最大页码数
	private Integer maxpage;
	
	public Integer getProjid() {
		return projid;
	}

	public void setProjid(Integer projid) {
		this.projid = projid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getPagenum() {
		return pagenum;
	}

	public void setPagenum(Integer pagenum) {
		this.pagenum = pagenum;
	}

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getPagecount() {
		return pagecount;
	}

	public void setPagecount(Integer pagecount) {
		this.pagecount = pagecount;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxpage() {
		return maxpage;
	}

	public void setMaxpage(Integer maxpage) {
		this.maxpage = maxpage;
	}

}
