package com.zlgl.ssh.service;

import java.util.List;

import com.zlgl.ssh.beans.Room;

/**
 *
 * @ClassName RoomManager.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月2日 下午4:57:16 
 * @Description 修改房间对应的业务逻辑层操作
 */
public interface RoomManager {
	/**
	 * 查询房间
	 * @param user
	 * @return boolean
	 */
	public List<Room> getRoom(Room room);
	public Room getObject(Room room);
	public void updateRoom(Room room);
}
