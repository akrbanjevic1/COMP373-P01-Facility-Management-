package Maintenance;

import Facility.FacilityInfo;

import java.util.HashMap;

public class InspectionInfo {
    private int InspectionInfoID;
    private HashMap<Integer, String> InspectionsList;

    public void setInspectionInfoID(int InfoID) { this.InspectionInfoID = InfoID; }

    public int getInspectionInfoID() { return this.InspectionInfoID; }

    public void addNewInspection(int InfoID, String FacilityName) {
        setInspectionInfoID(InfoID);

        this.InspectionsList.put(InspectionInfoID, FacilityName);
    }

    public void listInspections() {
        this.InspectionsList.forEach((k,v) -> System.out.println("Inspection ID: " + k + ", Name of facility: " + v));
    }
}
