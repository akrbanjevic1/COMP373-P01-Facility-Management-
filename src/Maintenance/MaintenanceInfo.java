package Maintenance;

import Facility.FacilityInfo;

import java.util.ArrayList;
import java.util.HashMap;

public class MaintenanceInfo {
    private int FacilityID; // TODO: This needs to be reflected on the UML
    private HashMap<Integer, Integer> MaintenanceRequestsList; // TODO: This needs to be reflected on the UML
    private HashMap<Integer, String> MaintenanceDescList; // TODO: This needs to be reflected on the UML
    private ArrayList<String> FacilityProblems; // TODO: This needs to be reflected on the UML

    public void setFacilityID(int ID) { this.FacilityID = ID; } // TODO: This needs to be reflected on the UML

    public int getFacilityID() { return this.FacilityID; } // TODO: This needs to be reflected on the UML

    public void makeFacilityMaintRequest(int FacilityID, int RequestID, String description) {
        setFacilityID(FacilityID);

        this.MaintenanceRequestsList.put(FacilityID, RequestID);
        this.MaintenanceDescList.put(RequestID, description);
    }

    public void reportFacilityProblem(String description) {
        FacilityProblems.add(description);
    }

    // TODO This ain't it
    public void calcProblemRateForFacility() {

    }

    public void listMaintRequests() {
        this.MaintenanceRequestsList.forEach((k,v) -> System.out.println("This request is for facility ID# " + k + ", and the maintenance request is ID# " + v + "."));
    }

    public void listMaintenance() {
        this.MaintenanceDescList.forEach((k,v) -> System.out.println("Request ID#" + k + " . Maintenance description: " + v));
    }

    public void listFacilityProblems() {
        for (String problem : FacilityProblems)
            System.out.println(problem);
    }

    // TODO This also ain't it
    public void calcDownTime() {

    }
}