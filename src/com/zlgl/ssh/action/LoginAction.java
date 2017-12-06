package com.zlgl.ssh.action;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zlgl.ssh.beans.Business;
import com.zlgl.ssh.beans.Employee;
import com.zlgl.ssh.beans.Evaluate;
import com.zlgl.ssh.beans.Room;
import com.zlgl.ssh.beans.User;
import com.zlgl.ssh.service.BusinessManager;
import com.zlgl.ssh.service.EmployeeManager;
import com.zlgl.ssh.service.EvaluateManager;
import com.zlgl.ssh.service.RoomManager;
import com.zlgl.ssh.service.UserManager;
import com.zlgl.ssh.web.BusinessCommand;
import com.zlgl.ssh.web.EvaluateCommand;

public class LoginAction extends ActionSupport{

private static final long serialVersionUID=1L;
	
	private User user;//用户对象
	
	private UserManager userManager;//逻辑层对象
	
	private RoomManager roomManager;//2017 12 2 刘聪添加RoomManager
	
	private EmployeeManager employeeManager;//2017 12 4 liu添加EmployeeManager
	
	private BusinessManager businessManager;//2017 12 5 liu添加BusinessManager
	
	private EvaluateManager evaluateManager;//2017 12 5 liu添加Evaluate Manager
	//以上四个添加的目的都是解决第一次跳转到修改主页面时，页面没数据的问题
	
	
	
	/**
	 * 用户登录执行方法
	 * @throws IOException 
	 */
	public String login() throws IOException{
		HttpServletResponse response=ServletActionContext.getResponse();
		HttpServletRequest request=ServletActionContext.getRequest();
		//房间
		Room room = new Room();
		room.setRoomnum("刘聪");
		List<Room> rooms = roomManager.getRoom(room);
		//员工
		Employee e1 = new Employee();
		e1.setNum("刘");
		List<Employee> es = employeeManager.getEmployees(e1);
		//营业
		BusinessCommand bc = new BusinessCommand();
		bc.setBeginT("2010-10-10");
		bc.setEndT("2010-10-12");
		List<Business> b = businessManager.getBusinesses(bc);
		bc.setSumAll(0);
		bc.setNumNormal(0);
		bc.setNumUnnormal(0);
		bc.setSumNormal(0);
		bc.setSumUnnormal(0);
		//评价
		EvaluateCommand ec = new EvaluateCommand();
		ec.setBeginT("2010-10-10");
		ec.setEndT("2010-10-11");
		List<Evaluate> e = evaluateManager.getEvaluates(ec);
		ec.setGoodType(0);
		ec.setNormalType(0);
		ec.setBadType(0);
		ec.setAllType(0);
		
		String temp=makeMD5(user.getPassword());
		System.out.println(user.getUsername()+"XXXxx"+user.getPassword()+"XXXxx"+temp);
		user.setPassword(temp);
		int a=userManager.logUser(user);
		if(a==1) {
		    request.getSession().setAttribute("uname", user.getUsername());
		    
			return "success";
		}
		else if(a==2){
			request.getSession().setAttribute("uname", user.getUsername());
			request.getSession().setAttribute("roomlist", rooms);
			request.getSession().setAttribute("elist", es);
			request.getSession().setAttribute("blist", b);
			request.getSession().setAttribute("bcommand", bc);
			request.getSession().setAttribute("evlist", e);
			request.getSession().setAttribute("ecommand",ec );
			return "adminSuccess";
		}
		else return ERROR;
	}
	
	/**
	 * 密码加密
	 * @param password
	 * @return
	 */
	public String makeMD5(String password) {
		MessageDigest md;
		   try {
		    // 生成一个MD5加密计算摘要
		    md = MessageDigest.getInstance("MD5");
		    // 计算md5函数
		    md.update(password.getBytes());
		    // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
		    // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
		    String pwd = new BigInteger(1, md.digest()).toString(10);
		    return pwd;
		   } catch (Exception e) {
		    e.printStackTrace();
		   }
		   return password;
		}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setRoomManager(RoomManager roomManager) {
		this.roomManager = roomManager;
	}

	public void setEmployeeManager(EmployeeManager employeeManager) {
		this.employeeManager = employeeManager;
	}

	public void setBusinessManager(BusinessManager businessManager) {
		this.businessManager = businessManager;
	}

	public void setEvaluateManager(EvaluateManager evaluateManager) {
		this.evaluateManager = evaluateManager;
	}
	
	
}
