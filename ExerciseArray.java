package com.chapter7;
import java.util.Scanner;
import java.util.Arrays;
public class ExerciseArray {
	Scanner get = new Scanner(System.in);
	int [] array = new int[20];
	int grade;
	
	
	public void collectValues() {

	
			
			System.out.println("Enter students grade: ");
			grade = get.nextInt();	
		
		checkInput();
	}
	public void checkInput () {
		if(grade>0 && grade<101) {
			
			
			
		}
		else {
			System.out.print("error! Grade cannot be more than 100 or less than 0." );
			collectValues();
		}
		
	}
	
	public String assignGrade (int index) {
		int checkGrade = array[index];
		String grade;
		switch(checkGrade/10) {
		case 10:
		case 9:
		case 8:
		case 7:
			grade = "A";
			break;
		case 6:
			grade = "B";
			break;
		case 5:
			grade = "C";
			break;
		case 4:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		
		}
		return grade;
		
	}
	
	public void printResult() {
		for(int i = 0; i<2; i++) {
			
			collectValues();
			array[i]=grade;
		}
		System.out.printf("%s%8s%10s%n", "Serial Number", "Scores", "Grades");
		for(int counter= 0; counter<2; counter++) {
			System.out.printf("%d%20d%8s%n", counter, array[counter], assignGrade(counter));
		}

		
		for(int i = 0; i<2; i++) {
			
			
			assignGrade(i);
			
			
		
	
		}

	}
	}
