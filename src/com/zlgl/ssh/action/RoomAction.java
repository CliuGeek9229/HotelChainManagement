package com.zlgl.ssh.action;
/**
 *
 * @ClassName RoomAction.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月2日 下午5:54:06 
 * @Description 修改房间控制层
 */

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.zlgl.ssh.beans.Room;
import com.zlgl.ssh.service.RoomManager;

public class RoomAction extends ActionSupport{
	private static final long serialVersionUID=1L;
	private Room room;
	private RoomManager roomManager;
	
	public String SearchRoom() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		List<Room> roomList = roomManager.getRoom(room);
		
			request.getSession().setAttribute("roomlist", roomList);
			return "success";	
	}

	public String JumpModifyRoom() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		Room room1 = roomManager.getObject(room);
		request.setAttribute("roomform", room1);
		
		return "success1";
	}
	public String UpdateRoom() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		Room room1 = new Room();
		room1.setRoomId(room.getRoomId());
		room1.setRoomnum(room.getRoomnum());
		room1.setType(room.getType());
		room1.setPrice(room.getPrice());
		room1.setDescription(room.getDescription());
		room1.setStatus(room.getStatus());
		System.out.println(room1.getRoomId());
		System.out.println(room1.getRoomnum());
		System.out.println(room1.getType());
		System.out.println(room1.getStatus());
		System.out.println(room1.getPrice());
		System.out.println(room1.getDescription());
		roomManager.updateRoom(room1);
		
		
		return "success2";
	}
	
	
	public void setRoomManager(RoomManager roomManager) {
		this.roomManager = roomManager;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
}
