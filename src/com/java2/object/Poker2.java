package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Poker2 {
	
	public static void main(String[]args){ 
		List<Integer>cards =new ArrayList<>();
     for(int i=1;i<=52;i++){
    cards.add(i);
     System.out.println(i);
	 }
  for (int j=1;j<=52;j++){
	Random random = new Random();
	int a =random.nextInt(51)+1;
	  cards.set(j,a);
	  cards.remove(j);
  }
}	
	
}
