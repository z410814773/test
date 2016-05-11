package com.nk.demo.pojo;

import java.util.Date;

public class Projects {
	
	private int projid;
	
	private String pname;
	
	private Date beginDate;
	
	private Date endDate;
	
	private int iflag;
	
	private Depts dept;

	public int getProjid() {
		return projid;
	}

	public void setProjid(int projid) {
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

	public int getIflag() {
		return iflag;
	}

	public void setIflag(int iflag) {
		this.iflag = iflag;
	}

	public Depts getDept() {
		return dept;
	}

	public void setDept(Depts dept) {
		this.dept = dept;
	}
}
