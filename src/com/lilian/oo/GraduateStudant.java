package com.lilian.oo;

public class GraduateStudant extends Student{
   int thesis;
   public GraduateStudant(){
	   
   }
   
   
   @Override
   public void print(){
	    System.out.println(pass);
		System.out.println(english+"\t"+math+"\t"+chinese+"\t"+thesis);
}
   @Override
   public int getAverage(){
		return (english+math+chinese+thesis/4);
}}
