package com.zlgl.ssh.service;

import java.util.List;

import com.zlgl.ssh.beans.Business;
import com.zlgl.ssh.web.BusinessCommand;

/**
 *
 * @ClassName BusinessManager.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月5日 上午11:22:37 
 * @Description 统计交易业务逻辑层
 */
public interface BusinessManager {
	public List<Business> getBusinesses(BusinessCommand bc);
	public List<Business> getBusinessesN(BusinessCommand bc);
	public List<Business> getBusinessesUn(BusinessCommand bc);
}
