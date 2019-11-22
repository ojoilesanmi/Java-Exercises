package com.chapter7;
import java.util.Scanner;
public class DuplicateElimination {
	int [] array = new int [5];
	int integer;

	
	public void saveInput(int index) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an Integer between 10 and 100: ");
		integer = input.nextInt();
		
		checkInput(index);
		
	}
	public void checkInput(int index) {
		if (integer >=10 && integer <= 100) {
			
			checkInputs(index);
		}
		else {
		
			System.out.println("Error! Reenter a number!");
			saveInput(index);
		}
			
	}
	
	
	public void checkInputs(int index) {
		
		for (int duplicate: array) {
			if(integer == duplicate) {
				System.out.println("Enter non duplicate number");
				saveInput(index);
				
			}
			else {
				
			
			}
		}
		
	}
	 public void printResult() {
		 
		 for(int i =0; i<array.length; i++) {
			 saveInput(i);	
				array[i] = integer;
			
		 }
		 for(int counter = 0; counter <array.length; counter++) {
			 System.out.print(array[counter] + " ");
		 }
	 }
			
	
	
	
		


}


