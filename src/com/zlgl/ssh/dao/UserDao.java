package com.zlgl.ssh.dao;

import org.hibernate.HibernateException;

import com.zlgl.ssh.beans.User;

public interface UserDao {
	
	/**
	 * 登录抽象方法
	 * @param obj
	 * @return boolean
	 * @throws HibernateException
	 */
	public int queryObject(User obj) throws HibernateException;

}
