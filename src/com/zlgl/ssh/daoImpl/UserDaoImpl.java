package com.zlgl.ssh.daoImpl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zlgl.ssh.beans.User;
import com.zlgl.ssh.dao.UserDao;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public int queryObject(User obj) throws HibernateException {
		HttpServletRequest request=ServletActionContext.getRequest();
		  String hql="from User where username='"+obj.getUsername()+"' and password='"+obj.getPassword()+"'";
		  List userlist=this.getHibernateTemplate().find(hql);
		  if (userlist.size()>0) {
			  if(((User) userlist.get(0)).getType()==1){
				  request.getSession().setAttribute("uuiidd",((User) userlist.get(0)).getUserId() );
				  return 1;
			  }
			  else if(((User) userlist.get(0)).getType()==2){
				  return 2;
			  }
			  else{
				  return 0;
			  }
		  }
		  else {
			  return 0;
		  }
	}

}
