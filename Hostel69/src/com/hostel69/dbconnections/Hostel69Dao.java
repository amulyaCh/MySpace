package com.hostel69.dbconnections;

import java.sql.Connection;
import java.util.List;

import com.hostel69.bean.RoomBean;

public interface Hostel69Dao {
	public Connection getConnectionObject() throws Exception;
	public void main(String[] args) throws Exception;
	public boolean validate(String username, String password) throws Exception;
	public boolean validate(String username) throws Exception;
	public List<RoomBean> checkAvailableRooms() throws Exception;
	
}
