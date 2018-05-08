package com.java2.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = java.util.Arrays.asList("1", "2", "3","4","5","6","7");

		for (int i= 7;i>=0; i--) {
			if(i%2==0){
		
			System.out.print(list.get(i)+"\t");
		
			}
		}
			

	}}