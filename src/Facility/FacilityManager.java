package Facility;

public class FacilityManager {
	private String ManagerName;
	private String ManagerAddress;
	private int ManagerID;
	private int AssignedGroupID;
	
	public FacilityManager(String ManagerName, String ManagerAddress, int ManagerID) {
		this.ManagerName = ManagerName;
		this.ManagerAddress = ManagerAddress;
		this.ManagerID = ManagerID;
	}
	
	//Setter Methods to Change Certain Variables
	public void setManagerName(String name) {
		this.ManagerName = name;
	}
	
	public void setManagerAddress(String Address) {
		this.ManagerAddress = Address;
	}
	
	public void setManagerID(int ID) {
		this.ManagerID = ID;
	}
	
	//Method to display the values for the name and address of Manager instance.
	public void getManagerDetails() {
		System.out.println("Name: " + this.ManagerName + " ManagerID: "+this.ManagerID+ " Address: " + this.ManagerAddress);
	}
	
	//This method assigns a group to the manager by passing a facilitygroup and then giving the manager it's ID. 
	public void assignGroup(int FacilityGroupID) {
		if (FacilityGroupID != 0) {
			this.AssignedGroupID = FacilityGroupID;
		}
		else {
			System.out.println("The Group has an ID of 0; please change the ID to something else and try again!");
		}
	}
	
	public void removeGroup() {
		AssignedGroupID = 0;
	}
	
	public void showAssignedGroup() {
		if (this.AssignedGroupID != 0) {
			int FacilityGroupID = this.AssignedGroupID;
			System.out.println("The assigned Group to this Manager is " + FacilityGroupID);
		}
		else {
			System.out.println("This Manager has a groupID value of 0; meaning they aren't assigned one yet :(");
		}
	}
	
}


