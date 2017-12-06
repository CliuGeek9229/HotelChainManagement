package com.zlgl.ssh.dao;

import java.util.List;

import org.hibernate.HibernateException;

import com.zlgl.ssh.beans.Room;

/**
 *
 * @ClassName RoomDao.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月2日 下午4:46:27 
 * @Description 房间类持久层接口
 */
public interface RoomDao {
	/**
	 * 房间查询抽象方法
	 * @param obj
	 * @return boolean
	 * @throws HibernateException
	 */
	public List<Room> queryObject(Room obj) throws HibernateException;
	public Room queryRoom(Room obj) throws HibernateException;
	public void updateRoom(Room obj) throws HibernateException;
}
