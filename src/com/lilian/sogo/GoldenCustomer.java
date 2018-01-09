package com.lilian.sogo;

public class GoldenCustomer extends SilverCustomer {
	int returnMoney=(int)(amount*0.1);
    public GoldenCustomer(int amount){
    	super(amount);
    
    }
    @Override
    public void print(){
    	
		int total = (int) (amount*(1-discount));
		System.out.println(amount+"\t"+total+"\t"+returnMoney);
	
    }
}
