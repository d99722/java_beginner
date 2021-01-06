package test;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("도");
		String province = keyboard.readLine();
		System.out.println(province);
		
	}

}
