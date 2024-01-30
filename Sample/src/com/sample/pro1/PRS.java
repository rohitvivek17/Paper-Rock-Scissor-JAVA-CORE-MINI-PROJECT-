package com.sample.pro1;

import java.util.Random;
import java.util.Scanner;

public class PRS {
	public static void main(String[] args) {
		
		System.out.println("**********************************************");
		System.out.println("*              PAPER ROCK SCISSOR            *");
		System.out.println("**********************************************");
		int a=10;
		int H=0;
		int AI=0;
		int no=0;
		while(a>0) {
			display();
			System.out.println("Enter Your Option: ");
			Scanner s=new Scanner(System.in);
			String c=s.next();
			Random r=new Random();
			if(no>5) {
				System.out.println("Final Score: ");
				System.out.println("Human: "+H+" | AI: "+AI);
				System.exit(0);
			}
			if(c.equals("R")) {
				int comp=10+r.nextInt(3)+1;
				if(comp==11) {
					System.out.println("You: Rock");
					System.out.println("AI: Rock");					
					System.out.println("Result: Draw");
					no=no+1;
					H=H+1;
					AI=AI+1;
					System.out.println("Human: "+H+" | AI: "+AI);
				}else if(comp==12) {
					System.out.println("You: Rock");
					System.out.println("AI: Paper");					
					System.out.println("Result: Lost");
					no=no+1;
					H=H+0;
					AI=AI+1;
					System.out.println("Human: "+H+" | AI: "+AI);
				}else if(comp==13) {
					System.out.println("You: Rock");
					System.out.println("AI: Scisor");					
					System.out.println("Result: WIN");
					no=no+1;
					H=H+1;
					AI=AI+0;
					System.out.println("Human: "+H+" | AI: "+AI);
				}
				
			}
		}
	}
	public static void display() {
		System.out.println("1. Rock: R");
		System.out.println("2. Paper: P");
		System.out.println("3. Scissor: S");
		System.out.println("_________________________________________________");
	}
}
