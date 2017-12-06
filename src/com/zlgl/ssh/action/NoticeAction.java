package com.zlgl.ssh.action;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zlgl.ssh.beans.Notice;
import com.zlgl.ssh.service.NoticeManager;

/**
 *
 * @ClassName NoticeAction.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月3日 下午10:55:06 
 * @Description 公告操作Action
 * 
 */
public class NoticeAction extends ActionSupport{
	private static final long serialVersionUID=1L;
	private Notice notice;
	private NoticeManager noticeManager;
	public String InsertNotice() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		Notice n1 = new Notice();
		n1.setCreateby((String) request.getSession().getAttribute("uname"));
		n1.setCreatedate(new Date());
		n1.setDays(notice.getDays());
		n1.setDetail(notice.getDetail());
		n1.setStatus(notice.getStatus());
		n1.setTitle(notice.getTitle());
		noticeManager.insertNotice(n1);
		return "success";
	}
	
	public Notice getNotice() {
		return notice;
	}
	public void setNotice(Notice notice) {
		this.notice = notice;
	}
	public void setNoticeManager(NoticeManager noticeManager) {
		this.noticeManager = noticeManager;
	}
}
