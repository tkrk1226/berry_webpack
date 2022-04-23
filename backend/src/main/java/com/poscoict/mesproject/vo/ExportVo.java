package com.poscoict.mesproject.vo;

public class ExportVo {
	
	// 제품 번호
	private String materialNumber;
	// 공장
	private String factory;
	// 중량
	private String weightPrd;
	// 고객사
	private String clientCompany;
	// 차량 번호
	private String carNumber;
	// 출하 일자
	private String shipmentDate;
	// 진도 코드
	private String processCd;
	// 상태 코드
	private String statusCd;
	// 현재 두께
	private String currentThickness;
	// 현재 길이
	private String currentLength;
	// 현재 폭
	private String currentWidth;
	// 현재 중량
	private String currentWeight;
	public String getMaterialNumber() {
		return materialNumber;
	}
	
	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getWeightPrd() {
		return weightPrd;
	}
	public void setWeightPrd(String weightPrd) {
		this.weightPrd = weightPrd;
	}
	public String getClientCompany() {
		return clientCompany;
	}
	public void setClientCompany(String clientCompany) {
		this.clientCompany = clientCompany;
	}
	public String getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	public String getShipmentDate() {
		return shipmentDate;
	}
	public void setShipmentDate(String shipmentDate) {
		this.shipmentDate = shipmentDate;
	}
	public String getProcessCd() {
		return processCd;
	}
	public void setProcessCd(String processCd) {
		this.processCd = processCd;
	}
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}
	public String getCurrentThickness() {
		return currentThickness;
	}
	public void setCurrentThickness(String currentThickness) {
		this.currentThickness = currentThickness;
	}
	public String getCurrentLength() {
		return currentLength;
	}
	public void setCurrentLength(String currentLength) {
		this.currentLength = currentLength;
	}
	public String getCurrentWidth() {
		return currentWidth;
	}
	public void setCurrentWidth(String currentWidth) {
		this.currentWidth = currentWidth;
	}
	public String getCurrentWeight() {
		return currentWeight;
	}
	public void setCurrentWeight(String currentWeight) {
		this.currentWeight = currentWeight;
	}

	@Override
	public String toString() {
		return "ExportVo [materialNumber=" + materialNumber + ", factory=" + factory + ", weightPrd=" + weightPrd
				+ ", clientCompany=" + clientCompany + ", carNumber=" + carNumber + ", shipmentDate=" + shipmentDate
				+ ", processCd=" + processCd + ", statusCd=" + statusCd + ", currentThickness=" + currentThickness
				+ ", currentLength=" + currentLength + ", currentWidth=" + currentWidth + ", currentWeight="
				+ currentWeight + "]";
	}	
	
}
