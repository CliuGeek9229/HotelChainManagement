package com.zlgl.ssh.action;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zlgl.ssh.beans.Evaluate;
import com.zlgl.ssh.service.EvaluateManager;
import com.zlgl.ssh.web.EvaluateCommand;

/**
 *
 * @ClassName EvaluateAction.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月5日 下午9:20:47 
 * @Description 统计评价控制层
 */
public class EvaluateAction extends ActionSupport{
	private static final long serialVersionUID=1L;
	private EvaluateCommand evaluateCommand;
	private EvaluateManager evaluateManager;
	public EvaluateCommand getEvaluateCommand() {
		return evaluateCommand;
	}
	public void setEvaluateCommand(EvaluateCommand evaluateCommand) {
		this.evaluateCommand = evaluateCommand;
	}
	public void setEvaluateManager(EvaluateManager evaluateManager) {
		this.evaluateManager = evaluateManager;
	}
	public String SearchEvaluate() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println(evaluateCommand.getBeginT());
		System.out.println(evaluateCommand.getEndT());
		System.out.println(evaluateCommand.getSelectType());
		
		Date beginDate = null;
		Date endDate = null;
		
		int allType = 0;
		int goodType = 0;
		int normalType = 0;
		int badType = 0;
		
		List<Evaluate> elist = evaluateManager.getEvaluates(evaluateCommand);
		List<Evaluate> elistG = evaluateManager.getEvaluatesG(evaluateCommand);
		List<Evaluate> elistN = evaluateManager.getEvaluatesN(evaluateCommand);
		List<Evaluate> elistB = evaluateManager.getEvaluatesB(evaluateCommand);
		
		goodType = elistG.size();
		normalType = elistN.size();
		badType = elistB.size();
		allType = elist.size();
		
		if(evaluateCommand.getSelectType().equals("0")) {
			request.getSession().setAttribute("evlist", elist);
			evaluateCommand.setAllType(allType);
			evaluateCommand.setGoodType(0);
			evaluateCommand.setNormalType(0);
			evaluateCommand.setBadType(0);
			request.getSession().setAttribute("ecommand", evaluateCommand);
		}else if(evaluateCommand.getSelectType().equals("1")){
			request.getSession().setAttribute("evlist", elistG);
			evaluateCommand.setAllType(0);
			evaluateCommand.setGoodType(goodType);
			evaluateCommand.setNormalType(0);
			evaluateCommand.setBadType(0);
			request.getSession().setAttribute("ecommand", evaluateCommand);
		}else if(evaluateCommand.getSelectType().equals("2")) {
			request.getSession().setAttribute("evlist", elistN);
			evaluateCommand.setAllType(0);
			evaluateCommand.setGoodType(0);
			evaluateCommand.setNormalType(normalType);
			evaluateCommand.setBadType(0);
			request.getSession().setAttribute("ecommand", evaluateCommand);
		}else {
			request.getSession().setAttribute("evlist", elistB);
			evaluateCommand.setAllType(0);
			evaluateCommand.setGoodType(0);
			evaluateCommand.setNormalType(0);
			evaluateCommand.setBadType(badType);
			request.getSession().setAttribute("ecommand", evaluateCommand);
		}
		return "success";
	}
}
