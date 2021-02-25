package Facility;

public class FacilityInfo implements Facility {
	public String Address;
	public int FacilityID;
	public String Name;
	
	
	public void setFacilityInfo(String Name, String Address, int id) {
		this.Address = Address;
		this.FacilityID = id;
		this.Name = Name;
	}
	
	public FacilityInfo getFacilityInfo() {
		return this;
	}
	
}
