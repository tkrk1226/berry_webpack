package com.poscoict.mesproject.vo;


public class InstructionVo {
	
	private String materialNumber;
	private String factory;
	private int sequence;
	private String workInstDate;
	private String workinstdateStart;
	private String workinstdateEnd;
	private String dueDate;
	private int targetWeight;
	private int targetThickness;
	private int targetWidth;
	private int targetLength;
	
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
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public String getWorkInstDate() {
		return workInstDate;
	}
	public void setWorkInstDate(String workInstDate) {
		this.workInstDate = workInstDate;
	}
	public String getWorkinstdateStart() {
		return workinstdateStart;
	}
	public void setWorkinstdateStart(String workinstdateStart) {
		this.workinstdateStart = workinstdateStart;
	}
	public String getWorkinstdateEnd() {
		return workinstdateEnd;
	}
	public void setWorkinstdateEnd(String workinstdateEnd) {
		this.workinstdateEnd = workinstdateEnd;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public int getTargetWeight() {
		return targetWeight;
	}
	public void setTargetWeight(int targetWeight) {
		this.targetWeight = targetWeight;
	}
	
	public int getTargetThickness() {
		return targetThickness;
	}
	public void setTargetThickness(int targetThickness) {
		this.targetThickness = targetThickness;
	}
	public int getTargetWidth() {
		return targetWidth;
	}
	public void setTargetWidth(int targetWidth) {
		this.targetWidth = targetWidth;
	}
	public int getTargetLength() {
		return targetLength;
	}
	public void setTargetLength(int targetLength) {
		this.targetLength = targetLength;
	}
	
	@Override
	public String toString() {
		return "InstructionVo [materialNumber=" + materialNumber + ", factory=" + factory + ", sequence=" + sequence
				+ ", workInstDate=" + workInstDate + ", workinstdateStart=" + workinstdateStart + ", workinstdateEnd="
				+ workinstdateEnd + ", dueDate=" + dueDate + ", targetWeight=" + targetWeight + ", targetThickness="
				+ targetThickness + ", targetWidth=" + targetWidth + ", targetLength=" + targetLength + "]";
	}
	
	
	
}
