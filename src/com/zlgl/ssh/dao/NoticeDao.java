package com.zlgl.ssh.dao;

import org.hibernate.HibernateException;

import com.zlgl.ssh.beans.Notice;

/**
 *
 * @ClassName NoticeDao.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月3日 下午10:29:25 
 * @Description 公告持久层
 */
public interface NoticeDao {
	public void insertNotice(Notice obj) throws HibernateException; 
}
