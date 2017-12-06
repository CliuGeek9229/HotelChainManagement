package com.zlgl.ssh.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zlgl.ssh.beans.Notice;
import com.zlgl.ssh.beans.Room;
import com.zlgl.ssh.dao.NoticeDao;

public class NoticeDaoImpl extends HibernateDaoSupport implements NoticeDao{

	@Override
	public void insertNotice(Notice obj) throws HibernateException {
		this.getHibernateTemplate().save(obj);
	}


}
