package com.zlgl.ssh.serviceImpl;

import java.util.List;

import com.zlgl.ssh.beans.Evaluate;
import com.zlgl.ssh.dao.EvaluateDao;
import com.zlgl.ssh.service.EvaluateManager;
import com.zlgl.ssh.web.EvaluateCommand;

/**
 *
 * @ClassName EvaluateManagerImpl.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月5日 下午9:12:31 
 * @Description 统计评价业务逻辑层实现
 */
public class EvaluateManagerImpl implements EvaluateManager{
	private EvaluateDao evaluateDao;
	@Override
	public List<Evaluate> getEvaluates(EvaluateCommand ec) {
		List<Evaluate> evaluateList = evaluateDao.queryEvaluates(ec);
		return evaluateList;
	}

	@Override
	public List<Evaluate> getEvaluatesG(EvaluateCommand ec) {
		List<Evaluate> evaluateList = evaluateDao.queryEvaluatesG(ec);
		return evaluateList;
	}

	@Override
	public List<Evaluate> getEvaluatesN(EvaluateCommand ec) {
		List<Evaluate> evaluateList = evaluateDao.queryEvaluatesN(ec);
		return evaluateList;
	}

	@Override
	public List<Evaluate> getEvaluatesB(EvaluateCommand ec) {
		List<Evaluate> evaluateList = evaluateDao.queryEvaluatesB(ec);
		return evaluateList;
	}

	public EvaluateDao getEvaluateDao() {
		return evaluateDao;
	}

	public void setEvaluateDao(EvaluateDao evaluateDao) {
		this.evaluateDao = evaluateDao;
	}
	

}
