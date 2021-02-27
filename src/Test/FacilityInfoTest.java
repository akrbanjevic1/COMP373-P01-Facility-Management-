package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Facility.FacilityInfo;

class FacilityInfoTest {
	private FacilityInfo facilityInfo;
	
	@BeforeEach
	public void setUp() throws Exception {
		facilityInfo = new FacilityInfo();
		facilityInfo.setFacilityAddress("12 Apple Lane");
		facilityInfo.setFacilityName("Thomas Warehouse");
		facilityInfo.setFacilityID(1034);
	}

	@Test
	public void testGetFacilityAddress() {
		assertEquals("12 Apple Lane", facilityInfo.getFacilityAddress(),"Should return address set");
	}

	@Test
	void testGetFacilityID() {
		assertEquals(1034, facilityInfo.getFacilityID(), "Should get ID previously set");
	}

	@Test
	void testGetFacilityName() {
		assertEquals("Thomas Warehouse",facilityInfo.getFacilityName());
	}

	@Test
	void testGetFacilityInfo() {
		String testString = "Address: "+"12 Apple Lane"+" FacilityID: "+1034+" Name: "+"Thomas Warehouse";
		assertEquals(testString, facilityInfo.getFacilityInfo(),"Should get all relevant details");
	}

}
