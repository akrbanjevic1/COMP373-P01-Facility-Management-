package Maintenance;

public class MaintenanceReq {
    private int RequestID;
    Double MAINTENANCE_COST = 50.25; // Rate per hour for maintenance work done // TODO: This needs to be reflected on the UML
    private Double hoursWorked; // Total hours worked per maintenance request // TODO: This needs to be reflected on the UML

    public void setRequestID(int ID) { this.RequestID = ID; }

    public void setHoursWorked(Double hours) { this.hoursWorked = hours; }

    public int getRequestID() { return this.RequestID; }

    public Double getHoursWorked() { return this.hoursWorked; }

    public void scheduleMaintenance(int ID, int date, String description) {
        setRequestID(ID);

        System.out.println("Maintenance request received.");
        System.out.println("Request ID: " + ID);
        System.out.println("Scheduled date: " + date);
        System.out.println("Service description: " + description);
    }

    public void calcMaintenanceCost(Double hours) {
        setHoursWorked(hours);

        Double maintenanceCost = MAINTENANCE_COST * hoursWorked;

        System.out.println("Total for this maintenance service: $" + maintenanceCost);
    }

    public void performMaintenance(int ID) {
        System.out.println("Starting maintenance for Request #" + ID + ".");
        System.out.println("\n...");
        System.out.println("Maintenance underway...\n");
        System.out.println("\n...");
        System.out.println("Maintenance complete.\n");
    }
}
