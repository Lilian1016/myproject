package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SimpleWriteTester {
	public static void main(String[] args) throws FileNotFoundException {
				PrintStream out = new PrintStream("data.txt");
				out.println("Hank�j�j\t1\t1000");
				out.flush();
				out.close();
			}
}
