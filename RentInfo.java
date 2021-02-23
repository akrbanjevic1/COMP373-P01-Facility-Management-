package Rent;

import Facility.FacilityInfo;

public class RentInfo {
	public int rentInfoID;
	public int actualUsage;
	public FacilityInfo facilityInfo;
	
	public RentInfo(int RentID, FacilityInfo facilityInfo) {
		this.rentInfoID = RentID;
		this.facilityInfo = facilityInfo;
	}
	
	
}
