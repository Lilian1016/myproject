package com.lilian;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
    int age = 0;
    float weight = 69.5f;
    char c = 65;
    char c2 = 'Z';
    int i = c2;
    
    
    System.out.println(i);
    
    Random r = new Random();
    int n1 = r.nextInt(6)+1;
    int n2 = r.nextInt(6)+1;
    int n3 = r.nextInt(6)+1;
    int n4 = r.nextInt(6)+1;
    System.out.println(3<=2);
    
    String s = new String("Hello");
    String s2 = "HAHAHAHAHAHA";
    int len = s.length();
    System.out.println("len:"+len);
    System.out.println(s.charAt(0));	
     
	int x = 5;
	int y = 3;
	float f =5.0f;
    int z = x % y;
    System.out.println(z);
    System.out.println(x>>99);
    System.out.println(x + 1);
    
 
	}
}
