
import java.io.*;

public class Squares {

	public static void main(String[] args) throws IOException {
		BufferedReader infile = new BufferedReader(new FileReader("data.in"));
		PrintWriter outfile = new PrintWriter(new FileWriter("data.out"));
		while (infile.ready()) {
			String line = infile.readLine().trim();
			try {
				int i = Integer.parseInt(line);
				outfile.println(i + "의 제곱은 " + (i*i) + " 입니다.");				
			} catch (Exception e) {
				outfile.println("For input string : \""+line+"\"은(는) 비정상 입력으로 무시합니다.");
			}
		}
        infile.close();
        outfile.close();
	}
}

