package com.hostel69.service;

import java.util.List;

import com.hostel69.bean.RoomBean;
import com.hostel69.dbconnections.Hostel69DaoImplementation;

public class Hostel69ServiceImplementation implements Hostel69Service {

	Hostel69DaoImplementation h69impl = new Hostel69DaoImplementation();
	@Override
	public List<RoomBean> checkHostelAvailabilityService(String hostelId,String startDate, String endDate) throws Exception 
	{
		List<RoomBean> list = null;
		try
		{
		 list = h69impl.checkAvailableRooms();	
		}catch(Exception e){
			
		}
		return null;
	}
    
	public List<RoomBean> checkHostelAvailabilityService() throws Exception 
	{
		
		return null;
	}
}
