package com.zlgl.ssh.serviceImpl;
import com.zlgl.ssh.beans.Notice;
/**
 *
 * @ClassName NoticeManagerImpl.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月3日 下午10:46:27 
 * @Description 业务逻辑层实现
 */
import com.zlgl.ssh.dao.NoticeDao;
import com.zlgl.ssh.service.NoticeManager;
import com.zlgl.ssh.service.RoomManager;

public class NoticeManagerImpl implements NoticeManager{
	private NoticeDao noticeDao;//实体对象

	public NoticeDao getNoticeDao() {
		return noticeDao;
	}

	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}

	@Override
	public void insertNotice(Notice notice) {
		noticeDao.insertNotice(notice);
		
	}
	
}
