package com.zlgl.ssh.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zlgl.ssh.beans.Business;
import com.zlgl.ssh.service.BusinessManager;
import com.zlgl.ssh.web.BusinessCommand;

/**
 *
 * @ClassName BusinessAction.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月5日 上午11:31:47 
 * @Description 统计营业控制层
 */
public class BusinessAction extends ActionSupport{
	private static final long serialVersionUID=1L;
	private BusinessCommand businessCommand;
	private BusinessManager businessManager;
	
	public String SearchBusiness() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println(businessCommand.getBeginT());
		System.out.println(businessCommand.getEndT());
		System.out.println(businessCommand.getIsShow());
		System.out.println(businessCommand.getSelectType());
		System.out.println(businessCommand.getSumType());
		
		Date beginDate = null;
		Date endDate = null;
		//trycatch 中的代码没有用到  不过对simpledateformat的使用很有帮助  留着吧
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			beginDate = sdf.parse(businessCommand.getBeginT());
			endDate = sdf.parse(businessCommand.getEndT());
			//Date b = sdf.format(beginDate.getTime());
			businessCommand.setrBeginT(beginDate);
			businessCommand.setrEndT(endDate);
			System.out.println(businessCommand.getrBeginT());
			System.out.println(businessCommand.getrEndT());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int sumall = 0;
		int sumnormal = 0;
		int sumunnormal = 0;
		int numnormal = 0;
		int numunnormal = 0;
		List<Business> bList = businessManager.getBusinesses(businessCommand);
		List<Business> bListN = businessManager.getBusinessesN(businessCommand);
		List<Business> bListUn = businessManager.getBusinessesUn(businessCommand);
		for (int i = 0; i < bList.size(); i++) {
			System.out.println(bList.get(i));
			sumall+=bList.get(i).getPrice();                    //计算得出总的营业额
		}
		for (int i = 0; i < bListN.size(); i++) {
			sumnormal+=bListN.get(i).getPrice();				//计算得出正常营业的营业额
		}
		for (int i = 0; i < bListUn.size(); i++) {
			sumunnormal+=bListUn.get(i).getPrice();				//计算得出折扣营业的营业额
		}
		numnormal = bListN.size();								//在规定的日期范围内正常营业的笔数
		numunnormal = bListUn.size();							//在规定的日期范围内折扣营业的笔数
		
		
		if(businessCommand.getIsShow().equals("1")) {
			if(businessCommand.getSelectType().equals("1")) {
				request.getSession().setAttribute("blist", bList);
			}else if(businessCommand.getSelectType().equals("2")) {
				request.getSession().setAttribute("blist", bListN);
			}else {
				request.getSession().setAttribute("blist", bListUn);
			}
			
		}else {
			businessCommand.setBeginT("2010-10-10");
			businessCommand.setEndT("2010-10-11");
			List<Business> bList1 = businessManager.getBusinesses(businessCommand);
			request.getSession().setAttribute("blist", bList1);
		}
		
		if(businessCommand.getSumType().equals("1")) {
			businessCommand.setSumAll(sumall);
			businessCommand.setSumNormal(0);
			businessCommand.setSumUnnormal(0);
			businessCommand.setNumNormal(0);
			businessCommand.setNumUnnormal(0);
			request.getSession().setAttribute("bcommand", businessCommand);
		}else if(businessCommand.getSumType().equals("2")) {
			businessCommand.setSumAll(0);
			businessCommand.setSumNormal(sumnormal);
			businessCommand.setSumUnnormal(0);
			businessCommand.setNumNormal(0);
			businessCommand.setNumUnnormal(0);
			request.getSession().setAttribute("bcommand", businessCommand);
		}else if(businessCommand.getSumType().equals("3")) {
			businessCommand.setSumAll(0);
			businessCommand.setSumNormal(0);
			businessCommand.setSumUnnormal(sumunnormal);
			businessCommand.setNumNormal(0);
			businessCommand.setNumUnnormal(0);
			request.getSession().setAttribute("bcommand", businessCommand);
		}else if(businessCommand.getSumType().equals("4")) {
			businessCommand.setSumAll(0);
			businessCommand.setSumNormal(0);
			businessCommand.setSumUnnormal(0);
			businessCommand.setNumNormal(numnormal);
			businessCommand.setNumUnnormal(0);
			request.getSession().setAttribute("bcommand", businessCommand);
		}else {
			businessCommand.setSumAll(0);
			businessCommand.setSumNormal(0);
			businessCommand.setSumUnnormal(0);
			businessCommand.setNumNormal(0);
			businessCommand.setNumUnnormal(numunnormal);
			request.getSession().setAttribute("bcommand", businessCommand);
		}
		
		return "success";
	}
	
	
	public BusinessCommand getBusinessCommand() {
		return businessCommand;
	}
	public void setBusinessCommand(BusinessCommand businessCommand) {
		this.businessCommand = businessCommand;
	}
	public void setBusinessManager(BusinessManager businessManager) {
		this.businessManager = businessManager;
	}
}
