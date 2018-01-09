package com.lilian.train;

public class Ticket {
	String date;
	String time;
	String terminal;
	String start;
	int price;

	public Ticket(String date,String time,String start,String terminal,int price){
	 this.price=price;
	 this.date=date;
	 this.time=time;	
	 this.start=start;
	 this.terminal=terminal;
	 
	}
	public void print(){
		System.out.println(date+"\t"+time+"\t"+start+"\t"+terminal+"\t"+price);
	
	}

}
