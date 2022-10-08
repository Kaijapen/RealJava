package com.caresoft.clinicapp;
import java.util.*;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    public AdminUser(Integer id, String role) {
    	super(id);
    	this.setRole(this.role);
    	
    }
    // TO DO: Implement HIPAACompliantUser!
    @Override
    public boolean assignPin(int pin) {
    	if(pin > 999999 && pin < 100000) {    		
    		return false;
    	}
    	super.pin = pin;
    	return true;
    }
    
    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
    	if(confirmedAuthID == employeeID) {
    		return true;
    	}
    	this.authIncident();
    	return false;
    }
    
    @Override
    public ArrayList<String> reportSecurityIncidents() {
    	return securityIncidents;
    }
    
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

    // TO DO: Setters & Getters
    public Integer getID() {
    	return employeeID;
    }
    
    public void setID(Integer id) {
    	employeeID = id;
    }
    
    
    public String getRole() {
    	return role;
    }
    
    public void setRole(String newRole) {
    	role = newRole;
    }
    
    
    public ArrayList<String> getIncidents(){
    	return securityIncidents;
    }
    
    public void setIncidents(String incident) {
    	securityIncidents.add(incident);
    }

}
