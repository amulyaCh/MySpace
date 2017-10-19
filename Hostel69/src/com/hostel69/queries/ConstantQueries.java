package com.hostel69.queries;

public interface ConstantQueries
{
	public static final String CHECK_AVAILABLE_ROOMS = "select Hotel_id,Date,no 0f rooms available, no _ of _ beds, cost "
			                                        + " from  hotels.location "
			                                        + " where date = ? , rooms = ? Hostel.location = ?";

}
