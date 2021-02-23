package Facility;

import Facility.FacilityInfo;
import java.util.HashMap;

public class FacilityGroup {
	public int GroupID;
	public HashMap<Integer, String> FacilitiesList;
	public int GroupCapacity;
	
	public FacilityGroup (int GroupID) {
		this.GroupID = GroupID;
		FacilitiesList = new HashMap<>();
	}
	
	public void addNewFacility(FacilityInfo facilityInfo) {
		this.FacilitiesList.put(facilityInfo.FacilityID,facilityInfo.Name);
		this.GroupCapacity += 1;
	}
	
	public void removeFacility(FacilityInfo facilityInfo) {
		this.FacilitiesList.remove(facilityInfo.FacilityID);
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
