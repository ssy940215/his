package com.neusoft.his.entity;

public class CheckTemplate {
    private int ID;
    private String Name;
    private int UserID;
    private String CreationTime;
    private String Scope;
    private int RecordType;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getCreationTime() {
		return CreationTime;
	}
	public void setCreationTime(String creationTime) {
		CreationTime = creationTime;
	}
	public String getScope() {
		return Scope;
	}
	public void setScope(String scope) {
		Scope = scope;
	}
	public int getRecordType() {
		return RecordType;
	}
	public void setRecordType(int recordType) {
		RecordType = recordType;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public CheckTemplate() {
		super();
	}
	public CheckTemplate(int iD, String name, int userID, String creationTime, String scope, int recordType,
			int delMark) {
		super();
		ID = iD;
		Name = name;
		UserID = userID;
		CreationTime = creationTime;
		Scope = scope;
		RecordType = recordType;
		DelMark = delMark;
	}
    
}
