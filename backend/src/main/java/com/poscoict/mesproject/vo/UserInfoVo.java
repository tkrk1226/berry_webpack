package com.poscoict.mesproject.vo;

public class UserInfoVo {
	
	private String userEmpNum;
	private String userName;
	private String userPhoneNum;
	private String userPwd;
	private String userRightF;
	private String userLatestDate;
	
	
	public String getUserEmpNum() {
		return userEmpNum;
	}
	public void setUserEmpNum(String userEmpNum) {
		this.userEmpNum = userEmpNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhoneNum() {
		return userPhoneNum;
	}
	public void setUserPhoneNum(String userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserRightF() {
		return userRightF;
	}
	public void setUserRightF(String userRightF) {
		this.userRightF = userRightF;
	}
	public String getUserLatestDate() {
		return userLatestDate;
	}
	public void setUserLatestDate(String userLatestDate) {
		this.userLatestDate = userLatestDate;
	}
	
	@Override
	public String toString() {
		return "UserInfoVo [userEmpNum=" + userEmpNum + ", userName=" + userName + ", userPhoneNum=" + userPhoneNum
				+ ", userPwd=" + userPwd + ", userRightF=" + userRightF + ", userLatestDate=" + userLatestDate + "]";
	}
	
	
	
	
	


	

	

}
