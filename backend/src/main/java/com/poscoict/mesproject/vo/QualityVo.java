package com.poscoict.mesproject.vo;

public class QualityVo {
	
	private String factory;
	private int widthMin;
	private int widthMax;
	private int thicknessMin;
	private int thicknessMax;
	private int lengthMin;
	private int lengthMax;
	private int weightMin;
	private int weightMax;
	private boolean confirm;
	
	public String getFactory() {
		return factory;
	}
	public void setFactory(String factory) {
		this.factory = factory;
	}
	public int getWidthMin() {
		return widthMin;
	}
	public void setWidthMin(int widthMin) {
		this.widthMin = widthMin;
	}
	public int getWidthMax() {
		return widthMax;
	}
	public void setWidthMax(int widthMax) {
		this.widthMax = widthMax;
	}
	public int getThicknessMin() {
		return thicknessMin;
	}
	public void setThicknessMin(int thicknessMin) {
		this.thicknessMin = thicknessMin;
	}
	public int getThicknessMax() {
		return thicknessMax;
	}
	public void setThicknessMax(int thicknessMax) {
		this.thicknessMax = thicknessMax;
	}
	public int getLengthMin() {
		return lengthMin;
	}
	public void setLengthMin(int lengthMin) {
		this.lengthMin = lengthMin;
	}
	public int getLengthMax() {
		return lengthMax;
	}
	public void setLengthMax(int lengthMax) {
		this.lengthMax = lengthMax;
	}
	public int getWeightMin() {
		return weightMin;
	}
	public void setWeightMin(int weightMin) {
		this.weightMin = weightMin;
	}
	public int getWeightMax() {
		return weightMax;
	}
	public void setWeightMax(int weightMax) {
		this.weightMax = weightMax;
	}
	public boolean isConfirm() {
		return confirm;
	}
	public void setConfirm(boolean confirm) {
		this.confirm = confirm;
	}
	@Override
	public String toString() {
		return "QualityVo [factory=" + factory + ", widthMin=" + widthMin + ", widthMax=" + widthMax + ", thicknessMin="
				+ thicknessMin + ", thicknessMax=" + thicknessMax + ", lengthMin=" + lengthMin + ", lengthMax="
				+ lengthMax + ", weightMin=" + weightMin + ", weightMax=" + weightMax + ", confirm=" + confirm + "]";
	}
	
}
