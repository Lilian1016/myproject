package com.lilian.oo;

import java.util.Scanner;

public class Drink {
		String key;
		int price;
	
		public Drink(String key,int price){
			this.key=key;
			this.price=price;
			
		}
	public static void main(String[]args){
		Scanner scanner =new Scanner(System.in);
		int m=0;
		int sum=0;
		
		while(m>=0){
			System.out.println(sum);
			String dir = scanner.nextLine();
			m = Integer.parseInt(dir);
		switch(m){
		case 1:
			 sum =sum+m;
			break;
		case 5:
			 sum=sum+m;
			break;
		case 10:
			 sum=sum+m;
			break;
			
			
		}
		}
		
		}

}
