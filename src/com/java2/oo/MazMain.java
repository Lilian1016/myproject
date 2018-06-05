package com.java2.oo;

public class MazMain {
	public  MazMain(){
		
		
	}
	 public static void main(String[]args){
		 new MazMain();
	 }
	 class Maze{
		 int row,col;
		 int trapCount;
		 int[] traps;
		 int[] positions;
		 Player player;
		 
		public Maze(int row, int col, int trapCount) {
			this.row = row;
			this.col = col;
			this.trapCount = trapCount;
		}
		 
	
	 }
	 class Player{
		 int hp =100;
		 int pos=0;
	 }

}
