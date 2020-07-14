
public class WhyMethod {

	public static void main(String[] args) {

		//100000000
		printTwoTimes("A", "-");
		System.out.println(twoTimes("a","-"));
		//100000000
		printTwoTimes("B", "*");
		printTwoTimes("AP", "!");
		

	}
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}

	public static void printTwoTimes(String text,String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
