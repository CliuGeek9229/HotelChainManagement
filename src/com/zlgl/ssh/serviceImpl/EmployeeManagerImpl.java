package com.zlgl.ssh.serviceImpl;

import java.util.List;

import com.zlgl.ssh.beans.Employee;
import com.zlgl.ssh.dao.EmployeeDao;
import com.zlgl.ssh.service.EmployeeManager;

/**
 *
 * @ClassName EmployeeManagerImpl.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月4日 上午10:20:08 
 * @Description 修改员工业务逻辑层实现
 */
public class EmployeeManagerImpl implements EmployeeManager{
	private EmployeeDao employeeDao;
	
	@Override
	public List<Employee> getEmployees(Employee e) {
		List<Employee> employeeList = employeeDao.queryObject(e);
		return employeeList;
	}

	@Override
	public Employee getEmployee(Employee e) {
		Employee e1 = employeeDao.queryEmployee(e);
		return e1;
	}

	@Override
	public void updateEmployee(Employee e) {
		employeeDao.updateEmployee(e);
		
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	

}
