package View;

import java.util.*;
import Facility.FacilityInfo;
import Facility.FacilityManager;
import Facility.FacilityGroup;
import Rent.RentInfo;
import Rent.Renter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacilityInfo TestFacility = new FacilityInfo();
		TestFacility.setFacilityInfo("Atwood Apartments", "123 Apple Ave Illinois", 01);
		TestFacility.getFacilityInfo();
		int testFacID = TestFacility.getFacilityID();
		String testFacName = TestFacility.getFacilityName();
		
		//Testing the adding of facility to group and removal of facility
		FacilityGroup TestGroup = new FacilityGroup(01);
		int TestGroupID = TestGroup.getGroupID();
		TestGroup.addNewFacility(testFacID, testFacName);
		TestGroup.listFacilities();
		TestGroup.removeFacility(testFacID);
		TestGroup.listFacilities();
		
		//Testing Manager of FacilityGroup features
		FacilityManager TestManager = new FacilityManager("John Smith", "456 Pear Boulevard", 1335);
		TestManager.assignGroup(TestGroupID);
		TestManager.showAssignedGroup();
		TestManager.removeGroup(); //testing to see if the manager had their assigned group removed here.
		TestManager.showAssignedGroup();
		TestManager.getManagerDetails();
		
		//Test Renter Object Here
		System.out.println("-----------------------------------------Testing of Rent related Objects starts here---------------------------------------");
		Renter testRenter = new Renter();
		testRenter.setRenterID(93);
		testRenter.setRenterAddress("1378 Pearl Ave, London UK");
		testRenter.setRenterName("Tom Smith");
		int testRenterID = testRenter.getRenterID();
		//Making another renter to test the Maximum function of RentInfo
		Renter testRenter2 = new Renter();
		testRenter2.setRenterID(92);
		testRenter2.setRenterAddress("098 I dont know Ave");
		testRenter2.setRenterName("Bob Smith");
		int testRenterID2 = testRenter2.getRenterID();
		
		//Test RentInfo Object here
		RentInfo testRentInfo = new RentInfo();
		testRentInfo.setFacility(TestFacility);
		testRentInfo.setRenterList();
		testRentInfo.setRentInfoID(1392);
		testRentInfo.setRentMaximum(2);
		
		testRentInfo.addRenter(testRenterID);
		testRentInfo.addRenter(testRenterID2);
		testRentInfo.listActualUsage();
		testRentInfo.calcUsageRate();
		testRentInfo.removeRenter(testRenterID);
		testRentInfo.listActualUsage();
		testRentInfo.calcUsageRate();
		
	}

}
