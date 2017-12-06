package com.zlgl.ssh.daoImpl;

import java.util.List;

import javax.management.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.zlgl.ssh.beans.Room;
import com.zlgl.ssh.dao.RoomDao;

public class RoomDaoImpl extends HibernateDaoSupport implements RoomDao{

	@Override
	public List<Room> queryObject(Room obj) throws HibernateException {
		HttpServletRequest request=ServletActionContext.getRequest();
		String hql="from Room where roomnum like '%"+obj.getRoomnum()+"%'";
		List roomList=this.getHibernateTemplate().find(hql);
		return roomList;
	}

	@Override
	public Room queryRoom(Room obj) throws HibernateException {
		HttpServletRequest request = ServletActionContext.getRequest();
		String hql = "from Room where roomnum= '"+obj.getRoomnum()+"'";
		List rooms = this.getHibernateTemplate().find(hql);
		Room room = new Room();
		for(int i=0;i<rooms.size();i++)
			room = (Room) rooms.get(i);
		return room;
	}

	@Override
	public void updateRoom(Room obj) throws HibernateException {
		
//		String hql="update Room room set room.type= '"+obj.getType()+"' , room.price= '"+obj.getPrice()+"' , room.status= '"+obj.getStatus()+"' , room.description= '"+obj.getDescription()+"' where room.roomnum= '"+obj.getRoomnum()+"'";
//		System.out.println(hql);
		this.getHibernateTemplate().update(obj);
		
	}

}
