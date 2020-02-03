package com.neusoft.his.entity;

public class RegistWork {
    private int ID;
    private int RegisterID;
    private String StartTime;
    private String EndTime;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getRegisterID() {
		return RegisterID;
	}
	public void setRegisterID(int registerID) {
		RegisterID = registerID;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
	public RegistWork() {
		super();
	}
	public RegistWork(int iD, int registerID, String startTime, String endTime) {
		super();
		ID = iD;
		RegisterID = registerID;
		StartTime = startTime;
		EndTime = endTime;
	}
    
}
