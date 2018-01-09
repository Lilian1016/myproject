package com.lilian.train;

public class Tester {
	
	public static void main(String[]args){
	Ticket t1=new Ticket("2018-01-08","18:30","松山","八堵",65);
	t1.print();
	Discount t2=new Discount("2018-01-08","5:14","板橋","左營",200);
	t2.print();
	}
}
