package com.lilian;

public class ScorceArray {
	
public static void main(String[]args){
   int scorces[][]=new int [5][3];
  scorces[0][0] =55;
  scorces[0][1] =64;
  scorces[0][2] =57;
  scorces[1][0] =69;
  scorces[1][1] =33;
  scorces[1][2] =72;
  scorces[2][0] =52;
  scorces[2][1] =85;
  scorces[2][2] =46;
  scorces[3][0] =82;
  scorces[3][1] =38;
  scorces[3][2] =90;
  scorces[4][0] =70;
  scorces[4][1] =52;
  scorces[4][2] =58;
  
  for (int i=0 ;i<5;i++){
	  System.out.print(scorces[i][0] + "\t" +scorces[i][1] + "\t" +scorces[i][2] + "\t");
	  int averge = (scorces[i][0]+scorces[i][1]+scorces[i][2])/3;
	  if(averge<60){
		  System.out.println(averge + "*");
	  }else{
		  System.out.println(averge);
	  }
  }
}
}