package test;

import javax.management.RuntimeErrorException;

public class Main {
	public void forTest() {
		int count = 0;
		for(count=0; count<3; count++) {
			System.out.println(count);
		}
		System.out.println(count+" at the end");
	}
	
	public void whileTest() {
		int count = 0;
		while(count<3) {
			count++;
			System.out.println(count);
		}
		System.out.println(count+" at the end");
	}
	
	public static void main(String[] args) {
		int hour = 3;
		for(int i=0; i<60; i++) {
			System.out.println(90-(hour*30)-(i-(i%12))/2);
			if(i%30==29)
				System.exit(1);
		}
		
	}

}
