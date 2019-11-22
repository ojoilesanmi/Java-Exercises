package com.chapter7;
import java.security.SecureRandom;
import java.util.Scanner;
public class AirlineBooking {
	


	
		boolean[] seat = new boolean[10];
		SecureRandom number = new SecureRandom();
		Scanner input = new Scanner(System.in);
		int firstCount=0;
		int ecoCount=0;
		int fullCounter= 0;
		
		public void classType() {
			
		
			System.out.println("Please type 1 for First Class and 2 for Economy: ");
			int category = input.nextInt();
		
			if(category == 1) {
				firstClass();
			}else {
				economy();
				
			}
			
		}
		public void firstClass() {
				int seatNumber = 1 + number.nextInt(5);
				if(seat[seatNumber-1] == false) {
					seat[seatNumber - 1] = true;
					firstCount++;
					fullCounter++;
					System.out.printf("You have been booked in a first class. Your seat number is: %d%n", seatNumber);
					}
				else { 
					full();
					
						if (firstCount == 5) {
							System.out.print("First class is fully booked. Do you want an economy class? Enter 1 to book economy: ");
							int category = input.nextInt();
								if(category == 1) {
									economy();
									}
							
						else {
							firstClass();
							}
						}
						firstClass();
						}
				}
			
		public void economy() {
			int seatNumber = 6 + number.nextInt(5);
			if(seat[seatNumber-1] == false) {
				seat[seatNumber - 1] = true;
				ecoCount++;
				fullCounter++;
				System.out.printf("You have been booked in an economy class. Your seat number is: %d%n", seatNumber);
				}
			else {
				full();
				
					if (ecoCount == 5) {
						System.out.print("Economy is fully booked. Do you want a first class? Enter 1 to book first class: ");
						int category = input.nextInt();
							if(category == 1) {
								firstClass();
								}
						
					else {
						economy();
						}
					}
					economy();
					}
		}
		public void full() {
			if(fullCounter == 10) {
				System.out.print("Oops. This flight is fully booked. Next flight leaves in the next 3 hours");
				System.exit(0);
			}
		}
		
}
