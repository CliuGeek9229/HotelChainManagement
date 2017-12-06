package com.zlgl.ssh.beans;
/**
 *
 * @ClassName Business.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月4日 下午5:39:09 
 * @Description 交易实体类
 */
import java.util.Date;

public class Business {
	private int id;
	private String detail;
	private int price;
	private Date bdate;
	private String createby;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
