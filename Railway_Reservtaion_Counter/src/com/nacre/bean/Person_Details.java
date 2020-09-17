package com.nacre.bean;

import java.time.LocalDate;

public class Person_Details {
	private  String trainName;
	private String source, destination;
	private  String tName;  
	private byte age;   
	private String gender;  
	private String country; 
	private long mobile;
	private Long pnr;
	private LocalDate date ;

	  public String toString() {
		  return trainName+" "+source+" "+ destination+" "+date+" "+tName + " "+age +" "+ gender +" "+ country +" "+ mobile + " " + pnr; 
	  }
	  public  String getTravellerTrainName() {
		  return trainName;
	  }
	  public String getSourceStationName() {
		return source;  
	  }
	  public String getDestinationStationName() {
			return destination;  
		  }
	  public LocalDate getTravelDate() {
		return date;  
	  }
	  public  String getTravellerName() {
		  return tName;
	  }
	  public byte getTravellerAge() {
		  return age;
	  }
	  public String getTravellerGender() {
		  return gender;
	  }
	  public String getTravellerCountry() {
		  return country;
	  }
	  public long getTtravellerMobile() {
		  return mobile;
	  }
	  
	  public void setTravellerTrainName(String trainName) {
		  this.trainName = trainName;
	  }
	  public void setSourceStationName(String source) {
			this.source = source;  
		  }
		  public void setDestinationStationName(String destination) {
				this.destination = destination;  
			  }
		  public void setTravelDate(String tdate) {  
			  LocalDate date = LocalDate.parse(tdate);
			  this.date  = date;
			  }
	  public void setTravellerName(String tName) {
		  this.tName = tName;
	  }
	  public void setTravellerAge(byte age) {
		  this.age = age;
	  }
	  public void setTravellerGender(String gender) {
		  this.gender = gender;
	  }
	  public void setTravellerCountry(String country) {
		  this.country = country;
	  }
	  public void setTravellerMobile(long mobile) {
		  this.mobile = mobile;
	  }
	
	  public  Long getPnr() { 
		  return pnr; 
		  } 
	  public void setPnr(Long pnr) {
		  this.pnr = pnr; 
		  }
}

