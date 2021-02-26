package Facility;

public class FacilityInfo implements Facility {
	private String Address;
	private int FacilityID;
	private String Name;
	
	
	public void addFacilityDetail(String Name, String Address, int id) {
		this.Address = Address;
		this.FacilityID = id;
		this.Name = Name;
	}
	//Setter methods
	public void setFacilityAddress(String Address) {
		this.Address = Address;
	}
	
	public void setFacilityID(int FacilityID) {
		this.FacilityID = FacilityID;
	}
	
	public void setFacilityName(String FacilityName) {
		this.Name = FacilityName;
	}
	//Getter Methods
	public String getFacilityAddress() {
		return this.Address;
	}
	
	public int getFacilityID() {
		return this.FacilityID;
	}
	
	public String getFacilityName() {
		return this.Name;
	}
	//Method to get details of facility in one neat line.
	public String getFacilityInfo() {
		String facilityInfo = ("Address: "+this.Address+" FacilityID: "+this.FacilityID+" Name: "+this.Name);
		return facilityInfo;
	}
}
