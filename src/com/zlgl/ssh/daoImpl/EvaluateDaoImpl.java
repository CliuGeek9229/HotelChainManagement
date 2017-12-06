package com.zlgl.ssh.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zlgl.ssh.beans.Evaluate;
import com.zlgl.ssh.dao.EvaluateDao;
import com.zlgl.ssh.web.EvaluateCommand;

/**
 *
 * @ClassName EvaluateDaoImpl.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月5日 下午9:03:51 
 * @Description 统计评价持久层实现
 */
public class EvaluateDaoImpl extends HibernateDaoSupport implements EvaluateDao{

	@Override
	public List<Evaluate> queryEvaluates(EvaluateCommand obj) throws HibernateException {
		String hql="from Evaluate where sdate between '"+obj.getBeginT()+"' and '"+obj.getEndT()+"'";
		System.out.println(hql);
		List blist = this.getHibernateTemplate().find(hql);
		System.out.println(blist);
		return blist;
	}

	@Override
	public List<Evaluate> queryEvaluatesG(EvaluateCommand obj) throws HibernateException {
		String hql="from Evaluate where sdate between '"+obj.getBeginT()+"' and '"+obj.getEndT()+"' and type='好评'";
		System.out.println(hql);
		List blist = this.getHibernateTemplate().find(hql);
		System.out.println(blist);
		return blist;
	}

	@Override
	public List<Evaluate> queryEvaluatesN(EvaluateCommand obj) throws HibernateException {
		String hql="from Evaluate where sdate between '"+obj.getBeginT()+"' and '"+obj.getEndT()+"' and type='中评'";
		System.out.println(hql);
		List blist = this.getHibernateTemplate().find(hql);
		System.out.println(blist);
		return blist;
	}

	@Override
	public List<Evaluate> queryEvaluatesB(EvaluateCommand obj) throws HibernateException {
		String hql="from Evaluate where sdate between '"+obj.getBeginT()+"' and '"+obj.getEndT()+"' and type='差评'";
		System.out.println(hql);
		List blist = this.getHibernateTemplate().find(hql);
		System.out.println(blist);
		return blist;
	}

}
