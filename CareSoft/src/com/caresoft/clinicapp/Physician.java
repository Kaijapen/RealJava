package com.caresoft.clinicapp;

import java.util.*;
public class Physician extends User implements HIPAACompliantUser{
	
	private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    // TO DO: Implement HIPAACompliantUser!
	
	public Physician(Integer id) {
		super(id);
		
	}
	
	@Override
	public boolean assignPin(int pin) {
		if (pin > 9999 && pin < 1000) {
			return false;
		}
		super.pin = pin;
		return true;
	}
	
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(confirmedAuthID == this.id){
			return true;
		}
		return false;
	}
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
    
    public ArrayList<String> getNotes(){
    	return patientNotes;
    }
    
    public void setNotes(String note){
    	patientNotes.add(note);
    }

}
