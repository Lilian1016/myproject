package com.lilian;

import java.util.Scanner;

public class age {
	public static void main(String[] args) {
		System.out.println("以下誰年紀最大?");
		System.out.println("1) 周杰倫");
		System.out.println("2) 華晨宇");
		System.out.println("3) 梁朝偉");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int answer = Integer.parseInt(line);
		if (answer ==3){
			System.out.println("答對了");
		}else{
			System.out.println("答錯了");
		}
				
	}
}
