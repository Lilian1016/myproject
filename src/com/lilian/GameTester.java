package com.lilian;

import java.util.Scanner;

public class GameTester {
	public static void main(String[]args){
		Scanner scanner =new Scanner(System.in);
		int n= 3;
	while(n!=0){
		System.out.println("�п�J��V: ");
		String dir = scanner.nextLine();
		n = Integer.parseInt(dir);
		switch(n){
		case 4:
			System.out.println("�V��");
			break;
		case 8:
			System.out.println("�V�W");
			break;
		case 2:
			System.out.println("�V�U");
			break;
		case 6:
			System.out.println("�V�k");
		    break;
		case 0:
			System.out.println("����");
			break;
		}
	}

}}
