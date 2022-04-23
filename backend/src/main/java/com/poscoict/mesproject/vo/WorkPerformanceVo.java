package com.poscoict.mesproject.vo;

public class WorkPerformanceVo {
	
	private String materialNumber;
	private String productionDate;
	private String factory;
	private String workMethod;
	private int outputWeight;
	
	private String workinstdateStart;
	private String workinstdateEnd;
	
	private int machineFour;
	private int machineSecond;
	private int machineHand;
	
	
	public String getMaterialNumber() {
		return materialNumber;
	}
	public void setMaterialNumber(String materialNumber) {
		this.materialNumber = materialNumber;
	}
	public String getProductionDate() {
		return productionDate;
	}
	public void setProductionDate(String productionDate) {
		this.productionDate = productionDate;
	}
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public String getWorkMethod() {
		return workMethod;
	}
	public void setWorkMethod(String workMethod) {
		this.workMethod = workMethod;
	}
	public int getOutputWeight() {
		return outputWeight;
	}
	public void setOutputWeight(int outputWeight) {
		this.outputWeight = outputWeight;
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
	public int getMachineFour() {
		return machineFour;
	}
	public void setMachineFour(int machineFour) {
		this.machineFour = machineFour;
	}
	public int getMachineSecond() {
		return machineSecond;
	}
	public void setMachineSecond(int machineSecond) {
		this.machineSecond = machineSecond;
	}
	public int getMachineHand() {
		return machineHand;
	}
	public void setMachineHand(int machineHand) {
		this.machineHand = machineHand;
	}
	@Override
	public String toString() {
		return "WorkPerformanceVo [materialNumber=" + materialNumber + ", productionDate=" + productionDate
				+ ", factory=" + factory + ", workMethod=" + workMethod + ", outputWeight=" + outputWeight
				+ ", workinstdateStart=" + workinstdateStart + ", workinstdateEnd=" + workinstdateEnd + ", machineFour="
				+ machineFour + ", machineSecond=" + machineSecond + ", machineHand=" + machineHand + "]";
	}
	
	
	
	
	
}
