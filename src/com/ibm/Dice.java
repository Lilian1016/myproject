package com.ibm;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++){
	        Random r = new Random();
		    int n1 = r.nextInt(6)+1;
		    int n2 = r.nextInt(6)+1;
		    int n3 = r.nextInt(6)+1;
		    int n4 = r.nextInt(6)+1;
		    System.out.println(n1+" "+n2+" "+n3+" "+n4);
		}

	}

}
