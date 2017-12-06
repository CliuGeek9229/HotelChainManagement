package com.zlgl.ssh.service;

import java.util.List;

import com.zlgl.ssh.beans.Evaluate;
import com.zlgl.ssh.web.EvaluateCommand;

/**
 *
 * @ClassName EvaluateManager.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月5日 下午9:10:18 
 * @Description 统计评价业务逻辑层
 */
public interface EvaluateManager {
	public List<Evaluate> getEvaluates(EvaluateCommand ec);
	public List<Evaluate> getEvaluatesG(EvaluateCommand ec);
	public List<Evaluate> getEvaluatesN(EvaluateCommand ec);
	public List<Evaluate> getEvaluatesB(EvaluateCommand ec);
}
