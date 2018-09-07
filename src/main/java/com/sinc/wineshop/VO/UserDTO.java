package com.sinc.wineshop.VO;

public class UserDTO {
	private String userName, userId, userPwd,  userGender;
	private String userAge;
	
	public UserDTO() {}
	
	public UserDTO(String userName, String userId, String userPwd, String userGender, String userAge) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userGender = userGender;
		this.userAge = userAge;
	}
	
	@Override
	public String toString() {
		return "UserDTO [userName=" + userName + ", userId=" + userId + ", userPwd=" + userPwd + ", userGender="
				+ userGender + ", userAge=" + userAge + "]";
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	
	
	

}
