package com.zlgl.ssh.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.zlgl.ssh.beans.Business;
import com.zlgl.ssh.web.BusinessCommand;

/**
 *
 * @ClassName BusinessDao.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月4日 下午7:14:46 
 * @Description 交易持久化层操作
 */
public interface BusinessDao {
	public List<Business> queryBusinesses(BusinessCommand obj) throws HibernateException;
	public List<Business> queryBusinessesN(BusinessCommand obj) throws HibernateException;
	public List<Business> queryBusinessesUn(BusinessCommand obj) throws HibernateException;
}
