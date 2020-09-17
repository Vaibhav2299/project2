package com.nacre.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.nacre.bean.Person_Details;
import com.nacre.controller.MainApplication;
import com.nacre.service.TicketDetails;

public class TicketDetails implements Services {

	ArrayList al = new ArrayList();
	 Scanner sc = new Scanner(System.in);
	 Person_Details person = null;
	 Long pnr = null;
	static int ticketCounter = 0;
	@Override
	public void bookTickets() {
		
		try {
			Person_Details person = new Person_Details();
			System.out.println("Enter Train Name or Train Number:");
			person.setTravellerTrainName(sc.next());
			System.out.println("Enter Your Source Station Name:");
			person.setDestinationStationName(sc.next());
			System.out.println("Enter Your Destination Station Name:");
			person.setDestinationStationName(sc.next());
			System.out.println("Enter Your Travel Date like YYYY-MM-DD:");
			person.setTravelDate(sc.next()); 
			System.out.println("Enter Passenger Name:");
			person.setTravellerName(sc.next());
			System.out.println("Enter Passenger age:");
			person.setTravellerAge(sc.nextByte());
			sc.nextLine();
			System.out.println("Enter Passenger Gender:");
			person.setTravellerGender(sc.next());
			System.out.println("Enter Passenger Nationality:");
			person.setTravellerCountry(sc.next());
			System.out.println("Enter Passenger Mobile Number:");
			person.setTravellerMobile(sc.nextLong());
			pnr = (long)(Math.random () * 9000000000l) + 1000000000;
			person.setPnr(pnr);
			al.add(person);
			System.out.println("You successfully Booked Your Ticket \nYour PNR No is: "+pnr);
			ticketCounter++;
		}
		catch(Exception e){
			System.out.println("Enter Your valid Information:");
			TicketDetails td = new TicketDetails();
			td.bookTickets();
		}
		
	}

	@Override
	public void cancelTicket() {
		System.out.println("Do you want to cancel the tickets\nEnter Yes or No");
		try {
			 
			String yes = sc.next();
			if(yes.equalsIgnoreCase("yes")) {
				System.out.println("Enter your PNR Number:");
				Long pnrToCancel = sc.nextLong();
				Iterator it = al.iterator();
				while(it.hasNext()) {
					Object obj = it.next();
					Person_Details p = (Person_Details) obj;
					if( p.getPnr().equals(pnrToCancel)) {
						al.remove(p);
						System.out.println("Your Ticket successfully Cancalled");
						ticketCounter--;
						break;
					}
				else {
					System.out.println("Enter Valid PNR Number");
				}
				}
			}
			else
				System.out.println("Choose another option:");
		}
		catch(Exception e) {
			System.out.println("Enter valid option");
		}
		
		
	}

	@Override
	public void reservationChart() {
		
		 if(pnr == null) 
			  System.out.println("There is no any reservation");
		  else 
		  { 
			  System.out.println("Reservation Chart:- \n");
			  System.out.println("Train name" +"\t"+"Traveller Name"+ "\t" + "PNR No"+"\t"+"Travelling Date");
			  Iterator it = al.iterator();
			  while(it.hasNext()) {
				  Object obj = it.next();
				  Person_Details p = (Person_Details)obj;
				System.out.println(p.getTravellerTrainName() + "\t" + p.getTravellerName()+"\t"+p.getPnr()+"\t\t"+p.getTravelDate());
			  } 
		  } 
		
	}

	@Override
	public void availableTickets() {
		 System.out.println("Available tickets are:-\n");
		  System.out.println(90 - ticketCounter);
		
	}

	@Override
	public void logout() {

		System.out.println("Thank U for Visiting Us. Visit Again!");
		String [] a= {};
		MainApplication.main(a);
	}

}
