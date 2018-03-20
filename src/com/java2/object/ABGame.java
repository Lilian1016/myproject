package com.java2.object;

public class ABGame {

	public static void main(String[] args) {
		String secret ="9873";
		String nums ="1356";
	//	String nums ="2461";
	//	String nums ="7835";
	//	String nums ="8739";
	//	String nums ="9873";
		int A=0;
		int B=0;
		int length = secret.length();
		
		for(int i=0;i<length;i++){
			char c = nums.charAt(i);
		for(int j=0;j<length;j++){
			if(c == secret.charAt(j)){
			if(i==j){
				A++;}
			else{
				B++;
			}
			}
		}
		}
		System.out.println(A+"A"+B+"B");
	}
}
