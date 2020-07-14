
public class LoopArray {

	public static void main(String[] args) {
		
		String[] users = new String[3];
		users[0] = "egoing";
		users[1] = "dgboy";
		users[2] = "gang";
	
		/*
		 * 원하는 결과 :
		 * <li>egoing</li>
		 * <li>dgboy</li>
		 * <li>gang</li>
		 */
		
		for(int i=0;i<users.length;i++) {
			System.out.println("<li>"+users[i]+"</li>");
		}
		
	}

}
