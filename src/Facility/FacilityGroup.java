package Facility;

import java.util.HashMap;

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
	public void addNewFacility(int FacilityID, String FacilityName) {
		this.FacilitiesList.put(FacilityID,FacilityName);
		this.GroupCapacity += 1;
	}
	
	public void removeFacility(int FacilityID) {
		this.FacilitiesList.remove(FacilityID);
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
