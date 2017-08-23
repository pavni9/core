package com.enterprise.core;

public class PerfectFactors {

	public int[] find(int number) {
		// check if number is perfect exponent of a number less that 9
		//eg: number = 32 , return int[]{2,5} since 2^5 = 32
		//eg: 36, return int[]{6,2}, since 6^2 = 36
		 //eg: 64, return either int[]{2,6} or int[]{8,2}
		//eg: 121, return null, even thought 121 = 11^2, 11 is greaterthan 9
		//eg: 40, return null
		
		int count =0;
		int temp=number;
		for (int i=2;i<=9;i++){
			temp=number;
			while(temp!=1) {
			if((temp%i) == 0){
				temp=temp%i;
				count++;
				if(temp==1){
					return new int[] {i,count};
				}
			}
			else {
				count =0;
			}
		}
		}
		return null;
	
	}
	}

