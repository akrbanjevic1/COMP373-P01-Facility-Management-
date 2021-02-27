# COMP373-P01-Facility-Management-
Project 1: Facility Management System Overview

System Description:

Main Functions
	For this project, we have designed a system that encompasses 3 “overarching” entities: Facility, FacilityMaintenance, and FacilityUse. With our system, we aim for users to be able to rent out large buildings/facilities for others to use, and to have them managed by professionals. These buildings will be maintained, and as a result, we have written code to ensure that the buildings remain in good condition. 

Assumptions
	While designing our project, we have made the following assumptions:

Each individual facility is represented by a FacilityInfo object. This object has the address, the name, and an ID for that specific facility.
Facility groups leverage these “info” sheets to add facilities to them. Each group can have multiple facilities in them, and the user should have the capability to add, remove, see the remaining capacity of a group, and view all current facilities assigned to a group.
In turn, each group is then assigned to a manager. We visualized individuals being hired to manage a group of these facilities/buildings, and thus each manager is then assigned a specific group. 
Each facility then is tied to a “RentInfo” sheet. We imagined this as being the renting record for a specific building/warehouse/etc. A facility can be rented by multiple people, and the user has the ability to set the maximum amount of renters renting the facility out. The user has the ability to remove renters, add renters, calculate the current usage rate, and see actual usage.
Renters are individual people with specific attributed (i.e. Name, Address, and a renterID). These people have facilities being associated with them via their rental agreements, and they are also associated with specific costs.
We made an abstract class called RentalCosts. We want developers to have the capability to expand this in case different types of charges are created (in the future). As it stands, we have created a class to cover the amount due for rent, and for any damages incurred by the renter. 

Viewing the Project:
	To see the program in action, run the ‘Main.java’ class in: (COMP373-P01-Facility-Management-/src/View/)

Unit Tests:
	To see the unit tests, check the "Test" folder under src.
