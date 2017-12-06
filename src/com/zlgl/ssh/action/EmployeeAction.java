package com.zlgl.ssh.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zlgl.ssh.beans.Employee;
import com.zlgl.ssh.service.EmployeeManager;

/**
 *
 * @ClassName EmployeeAction.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月4日 上午10:31:48 
 * @Description 修改员工控制层
 */
public class EmployeeAction extends ActionSupport{
	private static final long serialVersionUID=1L;
	private Employee employee;
	private EmployeeManager employeeManager;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public void setEmployeeManager(EmployeeManager employeeManager) {
		this.employeeManager = employeeManager;
	}
	
	
	public String SearchEmployee() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println(employee.getNum());
		List<Employee> employeeList = employeeManager.getEmployees(employee);
		request.getSession().setAttribute("elist", employeeList);
		return "success";
	}
	public String JumpModifyEmployee() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		Employee e1 = employeeManager.getEmployee(employee);
		request.setAttribute("employeeform", e1);
		return "success1";
	}
	public String UpdateEmployee() throws IOException{
		//HttpServletRequest request = ServletActionContext.getRequest();
		Employee e1 = new Employee();
		e1.setId(employee.getId());
		e1.setNum(employee.getNum());
		e1.setName(employee.getName());
		e1.setGender(employee.getGender());
		e1.setPhonenum(employee.getPhonenum());
		e1.setCardnum(employee.getCardnum());
		e1.setDepartment(employee.getDepartment());
		e1.setLevel(employee.getLevel());
		System.out.println(e1.getId()+"xxx"+e1.getNum());
		System.out.println(e1.getName()+"xx"+e1.getGender());
		System.out.println(e1.getCardnum()+"xx"+e1.getPhonenum());
		System.out.println(e1.getDepartment()+"xx"+e1.getLevel());
		
		//request.setAttribute("empform", e1);
		employeeManager.updateEmployee(e1);
		return "success2";
	}
}
