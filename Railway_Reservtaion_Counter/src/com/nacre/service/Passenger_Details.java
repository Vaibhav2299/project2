package com.nacre.service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.nacre.service.TicketDetails;

public class Passenger_Details {
		
	Scanner sc=new Scanner(System.in);
	 ArrayList al=new ArrayList();
	 	public void newUser() {
	 		try {
				
				  System.out.println("Enter Your Name:"); 
				  String newName=sc.next();
				  sc.nextLine();
				  al.add(newName);
				  System.out.println("Enter Your  Gender:"); 
				  String newGender=sc.next();
				  sc.nextLine();
				  al.add(newName);
				  System.out.println("Enter Your Date Of Birth In Formate YYYY-MON-DATE:");
				  String dob=sc.next(); 
				
				  LocalDate ld=LocalDate.parse(dob);
				  al.add(ld);
				  System.out.println("Enter Your AdharNumber:"); 
				  long adhar=sc.nextLong();
				  al.add(adhar);
				  System.out.println("Enter Your Mobile Number:"); 
				  Long mob=sc.nextLong();
				  al.add(mob);
				  System.out.println("Enter Your Martial Status:"); 
				  String ms=sc.next();
				  sc.nextLine();
				  al.add(ms);
				  System.out.println("Enter Your CountryName:"); 
				  String cname=sc.next();
				  sc.nextLine();
				 al.add(cname);
	 			System.out.println("Enter Your EmailId:");
	 			String email=sc.nextLine();

	 			al.add(email);
	 			System.out.println("Enter Your Password:");
	 			String pass=sc.nextLine();
	 			al.add(pass);
	 			System.out.println("You Have Registered Successfully");
	 			
	 		} catch(InputMismatchException ime) {
	 			System.out.println("Enter Your valid Information:");
	 		}
	 	}
	 	
	 	public void oldUser() {
	 		try {
	 			
				System.out.println("Enter your EmailId:");
				String oldUser = sc.nextLine();
				if(al.contains(oldUser)) {
					System.out.println("Enter your Password:");
					String pwd = sc.next();
					if(al.contains(pwd)) {
	 					System.out.println("Welcome to Railway Reservation Counter:\n");
						TicketDetails td = new TicketDetails();
						int n = 1;
						while(n > 0) {
							System.out.println("1. Book Ticket\n2. Cancel Ticket\n"
								+ "3. Reservation Chart\n4. Display Unbooked Tickets\n5.Logout");
							System.out.println("Enter Your Choice:");
							int choice = sc.nextInt();
							sc.nextLine();
							switch(choice) {
							case 1 :
								td.bookTickets();
								break;
							case 2 :
								td.cancelTicket();
								break;
							case 3 :
								td.reservationChart();
								break;
							case 4 :
								td.availableTickets();
								break;
							case 5 :
								td.logout();
								break;
							default :
								System.out.println("Enter Correct Choice");
							}
	 				} 
	 			} 
	 			else 
 					System.out.println("Enter Your Valid Password !!");
	 			} 
	 			else 
 					System.out.println("Enter Your Valid EmailId !!");
 				 
	 		} catch(InputMismatchException ime){
	 			System.out.println("Enter Your Valid EmailId or  Password");
	 		}
	 	}
}
