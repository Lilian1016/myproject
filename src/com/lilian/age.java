package com.lilian;

import java.util.Scanner;

public class age {
	public static void main(String[] args) {
		System.out.println("�H�U�֦~���̤j?");
		System.out.println("1) �P�N��");
		System.out.println("2) �ر�t");
		System.out.println("3) ��°�");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int answer = Integer.parseInt(line);
		if (answer ==3){
			System.out.println("����F");
		}else{
			System.out.println("�����F");
		}
				
	}
}
