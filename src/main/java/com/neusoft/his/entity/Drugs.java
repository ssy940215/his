package com.neusoft.his.entity;

public class Drugs {
    private int ID;
    private String DrugsCode;
    private String DrugsName;
    private String DrugsFormat;
    private String DrugsUnit;
    private String Manufacturer;
    private int DrugsDosageID;
    private int DrugsTypeID;
    private double DrugsPrice;
    private String MnemonicCode;
    private String CreationDate;
    private String LastUpdateDate;
    private int DelMark;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDrugsCode() {
		return DrugsCode;
	}
	public void setDrugsCode(String drugsCode) {
		DrugsCode = drugsCode;
	}
	public String getDrugsName() {
		return DrugsName;
	}
	public void setDrugsName(String drugsName) {
		DrugsName = drugsName;
	}
	public String getDrugsFormat() {
		return DrugsFormat;
	}
	public void setDrugsFormat(String drugsFormat) {
		DrugsFormat = drugsFormat;
	}
	public String getDrugsUnit() {
		return DrugsUnit;
	}
	public void setDrugsUnit(String drugsUnit) {
		DrugsUnit = drugsUnit;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public int getDrugsDosageID() {
		return DrugsDosageID;
	}
	public void setDrugsDosageID(int drugsDosageID) {
		DrugsDosageID = drugsDosageID;
	}
	public int getDrugsTypeID() {
		return DrugsTypeID;
	}
	public void setDrugsTypeID(int drugsTypeID) {
		DrugsTypeID = drugsTypeID;
	}
	public double getDrugsPrice() {
		return DrugsPrice;
	}
	public void setDrugsPrice(double drugsPrice) {
		DrugsPrice = drugsPrice;
	}
	public String getMnemonicCode() {
		return MnemonicCode;
	}
	public void setMnemonicCode(String mnemonicCode) {
		MnemonicCode = mnemonicCode;
	}
	public String getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(String creationDate) {
		CreationDate = creationDate;
	}
	public String getLastUpdateDate() {
		return LastUpdateDate;
	}
	public void setLastUpdateDate(String lastUpdateDate) {
		LastUpdateDate = lastUpdateDate;
	}
	public int getDelMark() {
		return DelMark;
	}
	public void setDelMark(int delMark) {
		DelMark = delMark;
	}
	public Drugs() {
		super();
	}
	public Drugs(int iD, String drugsCode, String drugsName, String drugsFormat, String drugsUnit, String manufacturer,
			int drugsDosageID, int drugsTypeID, double drugsPrice, String mnemonicCode, String creationDate,
			String lastUpdateDate, int delMark) {
		super();
		ID = iD;
		DrugsCode = drugsCode;
		DrugsName = drugsName;
		DrugsFormat = drugsFormat;
		DrugsUnit = drugsUnit;
		Manufacturer = manufacturer;
		DrugsDosageID = drugsDosageID;
		DrugsTypeID = drugsTypeID;
		DrugsPrice = drugsPrice;
		MnemonicCode = mnemonicCode;
		CreationDate = creationDate;
		LastUpdateDate = lastUpdateDate;
		DelMark = delMark;
	}
    
}
