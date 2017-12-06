package com.zlgl.ssh.serviceImpl;

import java.util.List;

import com.zlgl.ssh.beans.Business;
import com.zlgl.ssh.dao.BusinessDao;
import com.zlgl.ssh.service.BusinessManager;
import com.zlgl.ssh.web.BusinessCommand;

/**
 *
 * @ClassName BusinessManagerImpl.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月5日 上午11:27:58 
 * @Description 统计营业业务逻辑实现层
 */
public class BusinessManagerImpl implements BusinessManager{
	private BusinessDao businessDao;
	@Override
	public List<Business> getBusinesses(BusinessCommand bc) {
		List<Business> businessList=businessDao.queryBusinesses(bc);
		return businessList;
	}
	public BusinessDao getBusinessDao() {
		return businessDao;
	}
	public void setBusinessDao(BusinessDao businessDao) {
		this.businessDao = businessDao;
	}
	@Override
	public List<Business> getBusinessesN(BusinessCommand bc) {
		List<Business> businessList=businessDao.queryBusinessesN(bc);
		return businessList;
	}
	@Override
	public List<Business> getBusinessesUn(BusinessCommand bc) {
		List<Business> businessList=businessDao.queryBusinessesUn(bc);
		return businessList;
	}

}
