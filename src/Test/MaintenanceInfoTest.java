package Test;

import Maintenance.MaintenanceInfo;
import org.junit.jupiter.api.BeforeEach;

public class MaintenanceInfoTest {
    MaintenanceInfo maintenanceInfoObject = new MaintenanceInfo();

    @BeforeEach
    public void setUp() throws Exception {
        maintenanceInfoObject.setFacilityID(302);
    }
}
