package Facility;

import java.util.HashMap;
import Facility.FacilityInfo;

public class FacilityGroup {
	private int GroupID;
	private HashMap<Integer, String> FacilitiesList;
	private int GroupCapacity;
	
	public FacilityGroup (int GroupID) {
		this.GroupID = GroupID;
		FacilitiesList = new HashMap<>();
	}
	
	public int getGroupID() {
		return this.GroupID;
	}
	
	public void addNewFacility(FacilityInfo facilityInfo) {
		int FacilityInfoID = facilityInfo.getFacilityID();
		String FacilityName = facilityInfo.getFacilityName();
		this.FacilitiesList.put(FacilityInfoID,FacilityName);
		this.GroupCapacity += 1;
	}
	
	public void removeFacility(FacilityInfo facilityInfo) {
		int FacilityInfoID = facilityInfo.getFacilityID();
		this.FacilitiesList.remove(FacilityInfoID);
		this.GroupCapacity -= 1;
	}
	
	public void listFacilities() {
		this.FacilitiesList.forEach((k,v) -> System.out.println("ID = "
                + k + ", Name of Facility = " + v)); 
	}
	
	public void requestCapacity() {
		System.out.println("Current capacity of the group is: " + GroupCapacity);
	}
}
