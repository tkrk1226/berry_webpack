package com.poscoict.mesproject.vo;

public class MaterialVo {
	
	private String materialNumber;
	private int currentThickness;
	private int currentWidth;
	private int currentLength;
	private int currentWeight;
	private String workMethod;
	private String prdtQualityF;
	private String statusCd;
	private String processCd;
	private int sequence;
	private String factory;
	private int weightPrd;
	
	public String getMaterialNumber() {
		return materialNumber;
	}
	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}
	public int getCurrentThickness() {
		return currentThickness;
	}
	public void setCurrentThickness(int currentThickness) {
		this.currentThickness = currentThickness;
	}
	public int getCurrentWidth() {
		return currentWidth;
	}
	public void setCurrentWidth(int currentWidth) {
		this.currentWidth = currentWidth;
	}
	public int getCurrentLength() {
		return currentLength;
	}
	public void setCurrentLength(int currentLength) {
		this.currentLength = currentLength;
	}
	public int getCurrentWeight() {
		return currentWeight;
	}
	public void setCurrentWeight(int currentWeight) {
		this.currentWeight = currentWeight;
	}
	public String getWorkMethod() {
		return workMethod;
	}
	public void setWorkMethod(String workMethod) {
		this.workMethod = workMethod;
	}
	public String getPrdtQualityF() {
		return prdtQualityF;
	}
	public void setPrdtQualityF(String prdtQualityF) {
		this.prdtQualityF = prdtQualityF;
	}
	public String getStatusCd() {
		return statusCd;
	}
	public void setStatusCd(String statusCd) {
		this.statusCd = statusCd;
	}
	public String getProcessCd() {
		return processCd;
	}
	public void setProcessCd(String processCd) {
		this.processCd = processCd;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public int getWeightPrd() {
		return weightPrd;
	}
	public void setWeightPrd(int weightPrd) {
		this.weightPrd = weightPrd;
	}
	@Override
	public String toString() {
		return "MaterialVo [materialNumber=" + materialNumber + ", currentThickness=" + currentThickness
				+ ", currentWidth=" + currentWidth + ", currentLength=" + currentLength + ", currentWeight="
				+ currentWeight + ", workMethod=" + workMethod + ", prdtQualityF=" + prdtQualityF + ", statusCd="
				+ statusCd + ", processCd=" + processCd + ", sequence=" + sequence + ", factory=" + factory
				+ ", weightPrd=" + weightPrd + "]";
	}
	
}
