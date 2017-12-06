package com.zlgl.ssh.service;

import com.zlgl.ssh.beans.User;

public interface UserManager {

	/**
	 * 登录抽象类
	 * @param user
	 * @return boolean
	 */
	public int logUser(User user);
	
}
