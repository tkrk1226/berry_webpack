package com.poscoict.mesproject.vo;

public class ShipmentVo {
	
	private String materialNumber;
	private String receivingDate;	
	private String prdtName;
	private int initThickness;
	private int initWidth;
	private int initLength;
	private int initWeight;
	private String vendorName;
    private String vendorManager;
    private String clientCompany;
    private String shipmentDate;
    private String carNumber;
    
	public String getMaterialNumber() {
		return materialNumber;
	}
	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}
	public String getReceivingDate() {
		return receivingDate;
	}
	public void setReceivingDate(String receivingDate) {
		this.receivingDate = receivingDate;
	}
	public String getPrdtName() {
		return prdtName;
	}
	public void setPrdtName(String prdtName) {
		this.prdtName = prdtName;
	}
	public int getInitThickness() {
		return initThickness;
	}
	public void setInitThickness(int initThickness) {
		this.initThickness = initThickness;
	}
	public int getInitWidth() {
		return initWidth;
	}
	public void setInitWidth(int initWidth) {
		this.initWidth = initWidth;
	}
	public int getInitLength() {
		return initLength;
	}
	public void setInitLength(int initLength) {
		this.initLength = initLength;
	}
	public int getInitWeight() {
		return initWeight;
	}
	public void setInitWeight(int initWeight) {
		this.initWeight = initWeight;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorManager() {
		return vendorManager;
	}
	public void setVendorManager(String vendorManager) {
		this.vendorManager = vendorManager;
	}
	public String getClientCompany() {
		return clientCompany;
	}
	public void setClientCompany(String clientCompany) {
		this.clientCompany = clientCompany;
	}
	public String getShipmentDate() {
		return shipmentDate;
	}
	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	@Override
	public String toString() {
		return "ShipmentVo [materialNumber=" + materialNumber + ", receivingDate=" + receivingDate + ", prdtName="
				+ prdtName + ", initThickness=" + initThickness + ", initWidth=" + initWidth + ", initLength="
				+ initLength + ", initWeight=" + initWeight + ", vendorName=" + vendorName + ", vendorManager="
				+ vendorManager + ", clientCompany=" + clientCompany + ", shipmentDate=" + shipmentDate + ", carNumber="
				+ carNumber + "]";
	}
	
}
