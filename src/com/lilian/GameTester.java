package com.lilian;

import java.util.Scanner;

public class GameTester {
	public static void main(String[]args){
		Scanner scanner =new Scanner(System.in);
		int n= 3;
	while(n!=0){
		System.out.println("請輸入方向: ");
		String dir = scanner.nextLine();
		n = Integer.parseInt(dir);
		switch(n){
		case 4:
			System.out.println("向左");
			break;
		case 8:
			System.out.println("向上");
			break;
		case 2:
			System.out.println("向下");
			break;
		case 6:
			System.out.println("向右");
		    break;
		case 0:
			System.out.println("結束");
			break;
		}
	}

}}
