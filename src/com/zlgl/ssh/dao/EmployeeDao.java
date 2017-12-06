package com.zlgl.ssh.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.zlgl.ssh.beans.Employee;

/**
 *
 * @ClassName EmployeeDao.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月4日 上午9:43:38 
 * @Description 员工类持久层接口
 */
public interface EmployeeDao {
	public List<Employee> queryObject(Employee obj) throws HibernateException;
	public Employee queryEmployee(Employee obj) throws HibernateException;
	public void updateEmployee(Employee obj) throws HibernateException;
}
