package com.zlgl.ssh.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zlgl.ssh.beans.Business;
import com.zlgl.ssh.dao.BusinessDao;
import com.zlgl.ssh.web.BusinessCommand;

/**
 *
 * @ClassName BusinessDaoImpl.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月4日 下午8:51:38 
 * @Description 统计营业持久化层实现
 */
public class BusinessDaoImpl extends HibernateDaoSupport implements BusinessDao{

	@Override
	public List<Business> queryBusinesses(BusinessCommand obj) throws HibernateException {
		String hql="from Business where bdate between '"+obj.getBeginT()+"' and '"+obj.getEndT()+"'";
		System.out.println(hql);
		List blist = this.getHibernateTemplate().find(hql);
		System.out.println(blist);
		return blist;
	}

	@Override
	public List<Business> queryBusinessesN(BusinessCommand obj) throws HibernateException {
		String hql="from Business where bdate between '"+obj.getBeginT()+"' and '"+obj.getEndT()+"' and type='正常营业'";
		System.out.println(hql);
		List blist = this.getHibernateTemplate().find(hql);
		System.out.println(blist);
		return blist;
	}

	@Override
	public List<Business> queryBusinessesUn(BusinessCommand obj) throws HibernateException {
		String hql="from Business where bdate between '"+obj.getBeginT()+"' and '"+obj.getEndT()+"' and type='折扣营业'";
		System.out.println(hql);
		List blist = this.getHibernateTemplate().find(hql);
		System.out.println(blist);
		return blist;
	}
	
}
