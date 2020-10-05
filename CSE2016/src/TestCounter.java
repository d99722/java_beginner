
public class TestCounter {
	public static void main(String[] args) {
		Counter a = new Counter();
		a.count();
		a.count();
		Counter b = new Counter();
		b.count();
		a.count();
		Counter c = a;
		c.count();
		a.count();
		c = new Counter();
		c.count();
	}
}
