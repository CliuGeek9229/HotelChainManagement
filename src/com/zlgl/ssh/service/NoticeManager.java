package com.zlgl.ssh.service;

import com.zlgl.ssh.beans.Notice;

/**
 *
 * @ClassName NoticeManager.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月3日 下午10:42:55 
 * @Description 发布公告对应的业务逻辑层操作
 */
public interface NoticeManager {
	public void insertNotice(Notice notice);
}
