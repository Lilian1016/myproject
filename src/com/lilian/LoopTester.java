package com.lilian;

import java.util.Scanner;

public class LoopTester {
	public static void main(String[]args){
		System.out.println("�п�J�@�Ӽ�:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n=Integer.parseInt(line);
		int i=1;
		while (i<=n){
		System.out.println(i);
		i=i+1 ;
		if(i>10){
			break;
		}
		
		}
	}

}
