package com.hostel69.service;

import java.util.List;

import com.hostel69.bean.RoomBean;

public interface Hostel69Service {
 public List<RoomBean> checkHostelAvailabilityService() throws Exception;
 public List<RoomBean> checkHostelAvailabilityService(String hostelId,String startDate, String endDate) throws Exception;
}
