package com.zlgl.ssh.beans;

/**
 * 用户实体类
 * @author Administrator
 *
 */
public class User {

	private int userId;//用户ID
	private String username;//用户名
	private String password;//密码
	private int gender;//性别
	private int type;//用户类型
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
}
