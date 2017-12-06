package com.zlgl.ssh.beans;
/**
 *
 * @ClassName Room.java
 * @author Leno E-mail:cliugeek@us-forever.com
 * @date 2017年12月2日 下午4:28:26 
 * @Description 房间实体类
 */
public class Room {
	private int roomId;
	private String roomnum;
	private int type;
	private int price;
	private int status;
	private String description;
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomnum() {
		return roomnum;
	}
	public void setRoomnum(String roomnum) {
		this.roomnum = roomnum;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
