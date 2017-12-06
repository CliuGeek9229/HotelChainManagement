package com.zlgl.ssh.serviceImpl;

import org.springframework.beans.BeanUtils;

import com.zlgl.ssh.dao.UserDao;
import com.zlgl.ssh.beans.User;
import com.zlgl.ssh.service.UserManager;

public class UserManagerImpl implements UserManager{
	
	private UserDao dao;//实体对象

	@Override
	public int logUser(User user) {
	    int a=dao.queryObject(user);
	    return a;
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}

}
