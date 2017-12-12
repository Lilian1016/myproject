package com.lilian;

import java.util.Scanner;

public class GameTester {
	public static void main(String[]args){
		Scanner scanner =new Scanner(System.in);
		int pos=0;
		int row=3;
		int col = 5;
		int hp = 100;
		int n= 3;
	while(n!=0){
		System.out.println("Please enter a number: ");
		String dir = scanner.nextLine();
		n = Integer.parseInt(dir);
		if (hp<0){
			System.out.println("你死了");
			break;
		}

		switch(n){
		case 4:
			System.out.println("向左");
			if(pos%col!=0){
				pos= pos-1;
				hp=hp-5;
			System.out.println("pos:"+pos);
			System.out.println("HP:"+hp);
			}else{
				hp=hp-30;
				System.out.println("HP:"+hp);
			}
			break;

		case 8:
			System.out.println("向上");
			if(pos/col>=row-2){
				pos=pos-col;
				hp=hp-5;
				System.out.println("pos:"+pos);
				System.out.println("HP:"+hp);
			}else{
				hp=hp-30;
				System.out.println("HP:"+hp);
			}
			break;
		case 2:
			System.out.println("向下");
			if(pos/col<row-1){
				pos=pos+col;
				hp=hp-5;
				System.out.println("pos:"+pos);
				System.out.println("HP:"+hp);
			}else{
				hp=hp-30;
				System.out.println("HP:"+hp);
			}
				break;
			
		case 6:
			System.out.println("向右");
			if(pos%col!=4){
				pos=pos+1;
				hp=hp-5;
				System.out.println("pos:"+pos);
				System.out.println("HP:"+hp);
				}else{
					hp=hp-30;
					System.out.println("HP:"+hp);
				}
				break;
		case 0:
			System.out.println("BYE");
			break;
		}
	}

}}
