package boj;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		
	int[] testarr = new int[9];
	for(int i=0; i<testarr.length; i++) {
		testarr[i] = (int)(Math.random()*testarr.length);
	}
	
	for(int i=0; i<testarr.length; i++) {
		System.out.println(testarr[i]);
	}

	
	}
}
