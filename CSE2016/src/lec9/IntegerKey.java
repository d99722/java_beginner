package lec9;

public class IntegerKey implements Key{
	
	private int k;
	
	public IntegerKey(int i) {
		k = i;
	}
	
	@Override
	public boolean equals(Key c) {
		if(c instanceof IntegerKey)
			return k == ((IntegerKey)c).getInt();
		else
			return false;
	}

	public int getInt() {
		return k;
	}
	
}

