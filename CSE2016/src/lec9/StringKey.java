package lec9;

public class StringKey implements Key{
	private String s;
	
	public StringKey(String j) {
		s = j;
	}
	
	public boolean equals(Key m) {
		if (m instanceof StringKey)
			return s.equals(((StringKey)m).getString());
		else
			return false;
	}
	
	public String getString() {
		return s;
	}

}
