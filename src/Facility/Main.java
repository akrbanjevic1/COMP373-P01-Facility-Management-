package Facility;

import Facility.FacilityInfo;
import Facility.FacilityGroup;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacilityInfo TestFacility = new FacilityInfo();
		TestFacility.setFacilityInfo("Atwood Apartments", "123 Apple Ave Illinois", 01);
		
		//Testing the adding of facility to group and removal of facility
		FacilityGroup TestGroup = new FacilityGroup(01);
		TestGroup.addNewFacility(TestFacility);
		TestGroup.listFacilities();
		TestGroup.removeFacility(TestFacility);
		TestGroup.listFacilities();
		
		//Testing Manager of FacilityGroup features
		FacilityManager TestManager = new FacilityManager("John Smith", "456 Pear Boulevard", 1335);
		TestManager.assignGroup(TestGroup);
		TestManager.showAssignedGroup();
		TestManager.removeGroup();
		TestManager.showAssignedGroup();
		TestManager.getManagerDetails();
	}

}
