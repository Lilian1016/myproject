package com.lilian;

public class DateOfYear {
	public static void main(String[]args){
		int n = 33;
		int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		for ( int i=0;i<month.length;i++){
		if( n<=month[i]){
		System.out.println( (i+1)+"/"+n);
		break;
		  }else{
			  n=n-month[i];
		  }
		}
	}

}
