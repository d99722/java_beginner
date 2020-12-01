package lec7;

public class TextSearch {
	
	/* findChar
	 * */
	public int findChar(char c, String s) {
		boolean found = false;
		int index = 0;
		while (!found && index <s.length()) {
			if(s.charAt(index)==c)
				found = true;
			else
				index++;
		}
		if(!found)
			index = -1;
		return index;
	}
	
	public static void main(String[] args) {
		TextSearch text_search = new TextSearch();
		System.out.println(text_search.findChar('n', "Hanyang"));
		System.out.println(text_search.findChar('e', "Hanyang"));
	}
	
}
