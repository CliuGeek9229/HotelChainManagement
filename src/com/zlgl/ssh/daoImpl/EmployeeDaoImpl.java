package com.zlgl.ssh.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zlgl.ssh.beans.Employee;
import com.zlgl.ssh.beans.Room;
import com.zlgl.ssh.dao.EmployeeDao;

/**
 *
 * @ClassName EmployeeDaoImpl.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月4日 上午9:49:33 
 * @Description 员工持久层操作实现层
 */
public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao{

	@Override
	public List<Employee> queryObject(Employee obj) throws HibernateException {
		String hql="from Employee where num like '%"+obj.getNum()+"%'";
		List employeeList=this.getHibernateTemplate().find(hql);
		return employeeList;
	}

	@Override
	public Employee queryEmployee(Employee obj) throws HibernateException {
		String hql = "from Employee where num= '"+obj.getNum()+"'";
		List es = this.getHibernateTemplate().find(hql);
		Employee e = new Employee();
		for(int i=0;i<es.size();i++)
			e = (Employee) es.get(i);
		return e;
	}

	@Override
	public void updateEmployee(Employee obj) throws HibernateException {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(obj);
	}

}
