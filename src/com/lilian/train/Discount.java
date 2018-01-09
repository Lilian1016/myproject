package com.lilian.train;

public class Discount extends Ticket {
    
	
	public Discount(String date, String time, String start, String terminal, int price) {
		super(date, time, start, terminal, price);
		super.price=(int)(price*2*0.85f);
	}
	

	

}
