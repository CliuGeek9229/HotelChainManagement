package com.zlgl.ssh.service;

import java.util.List;

import com.zlgl.ssh.beans.Employee;

/**
 *
 * @ClassName EmployeeManager.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月4日 上午10:17:35 
 * @Description 修改员工对应的业务逻辑层的操作
 */
public interface EmployeeManager {
	public List<Employee> getEmployees(Employee e);
	public Employee getEmployee(Employee e);
	public void updateEmployee(Employee e);
}
