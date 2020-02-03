package com.neusoft.his.entity;

public class Department {
    private int ID;
    private String DeptCode;
    private String DeptName;
    private int DeptCategoryID;
    private int DeptType;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDeptCode() {
		return DeptCode;
	}
	public void setDeptCode(String deptCode) {
		DeptCode = deptCode;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	public int getDeptCategoryID() {
		return DeptCategoryID;
	}
	public void setDeptCategoryID(int deptCategoryID) {
		DeptCategoryID = deptCategoryID;
	}
	public int getDeptType() {
		return DeptType;
	}
	public void setDeptType(int deptType) {
		DeptType = deptType;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public Department() {
		super();
	}
	public Department(int iD, String deptCode, String deptName, int deptCategoryID, int deptType, int delMark) {
		super();
		ID = iD;
		DeptCode = deptCode;
		DeptName = deptName;
		DeptCategoryID = deptCategoryID;
		DeptType = deptType;
		DelMark = delMark;
	}
    
}
