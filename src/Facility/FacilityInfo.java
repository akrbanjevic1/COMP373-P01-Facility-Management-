package Facility;

public class FacilityInfo implements Facility {
	private String Address;
	private int FacilityID;
	private String Name;
	
	
	public void setFacilityInfo(String Name, String Address, int id) {
		this.Address = Address;
		this.FacilityID = id;
		this.Name = Name;
	}
	
	public String getFacilityAddress() {
		return this.Address;
	}
	
	public int getFacilityID() {
		return this.FacilityID;
	}
	
	public String getFacilityName() {
		return this.Name;
	}
	
	public String getFacilityInfo() {
		String facilityInfo = ("Address: "+this.Address+" FacilityID: "+this.FacilityID+" Name: "+this.Name);
		return facilityInfo;
	}
}
