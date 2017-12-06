package com.zlgl.ssh.web;
/**
 *
 * @ClassName EvaluateCommand.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月5日 下午8:43:47 
 * @Description 与前台交互的信息实体类
 */
public class EvaluateCommand {
	private String beginT;//前台返回的字符串类型的开始结束时间
	private String endT;
	private String selectType;//评价类型：好中差三等
	private int goodType;
	private int normalType;
	private int badType;
	private int allType;
	
	public int getAllType() {
		return allType;
	}
	public void setAllType(int allType) {
		this.allType = allType;
	}
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
	public String getSelectType() {
		return selectType;
	}
	public void setSelectType(String selectType) {
		this.selectType = selectType;
	}
	public int getGoodType() {
		return goodType;
	}
	public void setGoodType(int goodType) {
		this.goodType = goodType;
	}
	public int getNormalType() {
		return normalType;
	}
	public void setNormalType(int normalType) {
		this.normalType = normalType;
	}
	public int getBadType() {
		return badType;
	}
	public void setBadType(int badType) {
		this.badType = badType;
	}
	
}
