package com.neusoft.his.entity;

public class User {
    private int ID;
    private String UserName;
    private String Password;
    private String RealName;
    private int UseType;
    private int DocTitleID;
    private String IsScheduling;
    private int DeptID;
    private int RegistLeID;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRealName() {
		return RealName;
	}
	public void setRealName(String realName) {
		RealName = realName;
	}
	public int getUseType() {
		return UseType;
	}
	public void setUseType(int useType) {
		UseType = useType;
	}
	public int getDocTitleID() {
		return DocTitleID;
	}
	public void setDocTitleID(int docTitleID) {
		DocTitleID = docTitleID;
	}
	public String getIsScheduling() {
		return IsScheduling;
	}
	public void setIsScheduling(String isScheduling) {
		IsScheduling = isScheduling;
	}
	public int getDeptID() {
		return DeptID;
	}
	public void setDeptID(int deptID) {
		DeptID = deptID;
	}
	public int getRegistLeID() {
		return RegistLeID;
	}
	public void setRegistLeID(int registLeID) {
		RegistLeID = registLeID;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public User() {
		super();
	}
	public User(int iD, String userName, String password, String realName, int useType, int docTitleID,
			String isScheduling, int deptID, int registLeID, int delMark) {
		super();
		ID = iD;
		UserName = userName;
		Password = password;
		RealName = realName;
		UseType = useType;
		DocTitleID = docTitleID;
		IsScheduling = isScheduling;
		DeptID = deptID;
		RegistLeID = registLeID;
		DelMark = delMark;
	}
    
}
