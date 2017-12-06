package com.zlgl.ssh.beans;

import java.util.Date;

/**
 *
 * @ClassName Evaluate.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月4日 下午5:40:58 
 * @Description 评价实体类
 */
public class Evaluate {
	private int id;
	private String cusname;
	private String detail;
	private String type;
	private Date sdate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getSdate() {
		return sdate;
	}
	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}
	
}
