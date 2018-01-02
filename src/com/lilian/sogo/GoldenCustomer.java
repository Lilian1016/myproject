package com.lilian.sogo;

public class GoldenCustomer extends Customer {
	int returnMoney=(int)(amount*0.1);
    public GoldenCustomer(int amount){
    	super(amount);
    	super.discount=0.1f;
    }
    @Override
    public void print(){
    	
		int total = (int) (amount*(1-discount));
		System.out.println(amount+"\t"+total+"\t"+returnMoney);
	
    }
}
