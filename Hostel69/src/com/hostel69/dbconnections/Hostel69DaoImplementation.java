package com.hostel69.dbconnections;

import java.sql.*;
import java.util.List;

import com.hostel69.bean.RoomBean;

public class Hostel69DaoImplementation implements Hostel69Dao {

	public Connection getConnectionObject() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection  con = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/hostel69","root","");
		return con;
	}
	
	public void main(String[] args) throws Exception {
		System.out.println(validate("ac@gmail.com", "abc1"));
	}


	public boolean validate(String username, String password) throws Exception{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			//register the driver
			con= getConnectionObject();
			stmt = con.createStatement();
			System.out.println("Created DB Connection....");
			rs = stmt.executeQuery("select email from customer where email = '" + username + "' and "
					+ " password = '" + password + "'");
			if(rs.next()){
				return true;
			}

		} catch(SQLException e) {
			e.printStackTrace();
		} 
		finally
		{
			try{
				rs.close();
				stmt.close();
				con.close();
			}
			catch(SQLException e)
			{
				System.out.println("check your connection username and password");
			}

		}
		return false;
	}
	
	public boolean validate(String username) throws Exception
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			//register the driver
			con= getConnectionObject();
			stmt = con.createStatement();
			System.out.println("Created DB Connection....");
			rs = stmt.executeQuery("select email from customer where email = '" + username + "'");
			if(rs.next()){
				return true;
			}

		} catch(SQLException e) {
			e.printStackTrace();
		} 
		finally
		{
			try{
				rs.close();
				stmt.close();
				con.close();
			}
			catch(SQLException e)
			{
				System.out.println("check your connection username and password");
			}

		}
		return false;
	}

	
	public List<RoomBean> checkAvailableRooms() throws Exception
	{
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try
		{
			con= getConnectionObject();	
			stmt = con.createStatement();
			System.out.println("Connecting to db.... ");
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return null;
	}
}














