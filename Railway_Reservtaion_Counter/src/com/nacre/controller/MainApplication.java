package com.nacre.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.nacre.service.Passenger_Details;

public class MainApplication {
		
	public static void main(String[] args) {
			
			System.out.println("\t\tWelcome To Railway Reservation Center\n"
					+ "\n 1. Register as a Customer\n 2. Login as Customer\n 3. Exit");
			Scanner sc=new Scanner(System.in);
		
			Passenger_Details pd=new Passenger_Details();
			int choice = 0,n = 1;
			while(n > 0) {
				try {
					System.out.println("Enter your choice:");
					choice = sc.nextInt();
				}
				catch(InputMismatchException ime) {
					System.out.println("Enter valid choice which given in display menu,"
							+ "\nChoose only one choice 1 or 2 or 3");
				}
				switch(choice) {
				case 1 :
					pd.newUser();
					break;
				case 2 :
					pd.oldUser();
					break;
				case 3 :
					System.exit(0);
					break;
				default :
					System.out.println("Enter Correct Choice");
				}
						
			}

					
		}
}
