package com.sample.pro1;

public class Demo1 {
	public static void main(String[] args) {
		byte a=12;
		long b=a;	//Automatically->Widening
		byte c=(byte)(short)(long)b;	// Manually->Narrow
		System.out.println(a);
		System.out.println("Welcome");
	}
}
