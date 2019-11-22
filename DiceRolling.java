package com.chapter7;

import java.security.SecureRandom;

public class DiceRolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom random = new SecureRandom();
		int[] frequency = new int[13];
		int firstDie= 0;
		int secondDie = 0;
		
		for(int roll = 1; roll <=36_000_000; roll++) {
			firstDie= 1 + random.nextInt(6);
			secondDie= 1 + random.nextInt(6);
		++frequency[firstDie + secondDie];
		}
		
		System.out.printf("%s%10s%n", "sum", "frequency");
		
		
		for(int sum =2; sum<frequency.length; sum++) {
			System.out.printf("%4d%10d%n", sum, frequency[sum]);
		}
		
		
		
		

	}


	}

