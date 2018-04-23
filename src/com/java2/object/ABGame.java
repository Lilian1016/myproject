package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		String secret ="9873";
		String nums ="1356";
	//	String nums ="2461";
	//	String nums ="7835";
	//	String nums ="8739";
	//	String nums ="9873";
		int A=0;
		int B=0;
		Scanner scanner =new Scanner(System.in);
		while(A!=4) {
			A=0;
			B=0;
		System.out.println("Please enter your guess:");
		String num =scanner.nextLine();
		int length = secret.length();
		
		for(int i=0;i<num.length();i++){
			char c = num.charAt(i);
		for(int j=0;j<length;j++){
			if(c == secret.charAt(j)){
			if(i==j){
				A++;}
			else{
				B++;
			}
			}
		}
		}
		System.out.println(A+"A"+B+"B");
	}
}}
