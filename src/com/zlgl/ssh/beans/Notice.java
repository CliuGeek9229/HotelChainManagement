package com.zlgl.ssh.beans;

import java.util.Date;

/**
 *
 * @ClassName Notice
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月3日 下午7:47:45 
 * @Description 公告实体类
 */
public class Notice {
	private int noticeid;
	private String title;
	private int days;
	private String detail;
	private int status;
	private String createby;
	private Date createdate;
	public int getNoticeid() {
		return noticeid;
	}
	public void setNoticeid(int noticeid) {
		this.noticeid = noticeid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	
}
