package com.zlgl.ssh.web;

import java.util.Date;

/**
 *
 * @ClassName BusinessCommand.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月4日 下午8:26:02 
 * @Description 获取交易前台信息实体类
 */
public class BusinessCommand {
	private String beginT;//前台返回的字符类型的开始结束时间
	private String endT;
	private String type;//未使用到  也不知道中午咋想的
	private String selectType;//交易类型（正常和折扣）
	private String sumType;//统计类别
	private String isShow;//是否显示
	private Date rBeginT;//真正的开始和结束的时间//这两个属性未被使用
	private Date rEndT;//原因是前台给的String类型能搞定日期的查询
	//2017 12 05下午添加   添加了几个显示在统计页面的属性
	private int sumAll;
	private int sumNormal;
	private int sumUnnormal;
	private int numNormal;
	private int numUnnormal;
	
	public String getBeginT() {
		return beginT;
	}
	public void setBeginT(String beginT) {
		this.beginT = beginT;
	}
	public String getEndT() {
		return endT;
	}
	public void setEndT(String endT) {
		this.endT = endT;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSelectType() {
		return selectType;
	}
	public void setSelectType(String selectType) {
		this.selectType = selectType;
	}
	public String getSumType() {
		return sumType;
	}
	public void setSumType(String sumType) {
		this.sumType = sumType;
	}
	public String getIsShow() {
		return isShow;
	}
	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public Date getrBeginT() {
		return rBeginT;
	}
	public void setrBeginT(Date rBeginT) {
		this.rBeginT = rBeginT;
	}
	public Date getrEndT() {
		return rEndT;
	}
	public void setrEndT(Date rEndT) {
		this.rEndT = rEndT;
	}
	public int getSumAll() {
		return sumAll;
	}
	public void setSumAll(int sumAll) {
		this.sumAll = sumAll;
	}
	public int getSumNormal() {
		return sumNormal;
	}
	public void setSumNormal(int sumNormal) {
		this.sumNormal = sumNormal;
	}
	public int getSumUnnormal() {
		return sumUnnormal;
	}
	public void setSumUnnormal(int sumUnnormal) {
		this.sumUnnormal = sumUnnormal;
	}
	public int getNumNormal() {
		return numNormal;
	}
	public void setNumNormal(int numNormal) {
		this.numNormal = numNormal;
	}
	public int getNumUnnormal() {
		return numUnnormal;
	}
	public void setNumUnnormal(int numUnnormal) {
		this.numUnnormal = numUnnormal;
	}
	
	
}
