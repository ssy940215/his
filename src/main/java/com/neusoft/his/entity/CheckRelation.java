package com.neusoft.his.entity;

public class CheckRelation {
    private int ID;
    private int CheckProjID;
    private int CheckTempID;
    private String Position;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getCheckProjID() {
		return CheckProjID;
	}
	public void setCheckProjID(int checkProjID) {
		CheckProjID = checkProjID;
	}
	public int getCheckTempID() {
		return CheckTempID;
	}
	public void setCheckTempID(int checkTempID) {
		CheckTempID = checkTempID;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public CheckRelation() {
		super();
	}
	public CheckRelation(int iD, int checkProjID, int checkTempID, String position) {
		super();
		ID = iD;
		CheckProjID = checkProjID;
		CheckTempID = checkTempID;
		Position = position;
	}
    
    
}
