package com.zlgl.ssh.serviceImpl;

import java.util.List;

import com.zlgl.ssh.beans.Room;
import com.zlgl.ssh.dao.RoomDao;
import com.zlgl.ssh.service.RoomManager;

public class RoomManagerImpl implements RoomManager{
	private RoomDao roomDao;//roomDao实体对象
	
	@Override
	public List<Room> getRoom(Room room) {
		List<Room> roomList = roomDao.queryObject(room);
		return roomList;
	}
	@Override
	public Room getObject(Room room) {
		Room rom = roomDao.queryRoom(room);
		return rom;
	}
	@Override
	public void updateRoom(Room room) {
		roomDao.updateRoom(room);
	}

	public RoomDao getRoomDao() {
		return roomDao;
	}

	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}
	


	

}
