package com.zlgl.ssh.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.zlgl.ssh.beans.Evaluate;
import com.zlgl.ssh.web.EvaluateCommand;

/**
 *
 * @ClassName EvaluateDao.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月5日 下午8:42:35 
 * @Description 统计评价持久化层操作
 */
public interface EvaluateDao {
	public List<Evaluate> queryEvaluates(EvaluateCommand obj) throws HibernateException;
	public List<Evaluate> queryEvaluatesG(EvaluateCommand obj) throws HibernateException;
	public List<Evaluate> queryEvaluatesN(EvaluateCommand obj) throws HibernateException;
	public List<Evaluate> queryEvaluatesB(EvaluateCommand obj) throws HibernateException;
}
