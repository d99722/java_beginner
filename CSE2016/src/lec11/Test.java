package lec11;

import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		String file_name = "poem.txt";
		FileReader reader = new FileReader(file_name);
		BufferedReader infile = new BufferedReader(reader);
		PrintWriter outfile = new PrintWriter(new FileWriter(file_name+".out"));
		while(infile.ready()) {		
			String s = infile.readLine();
			outfile.println(s);
		}
		infile.close();
		outfile.close();
		
	}
}
 