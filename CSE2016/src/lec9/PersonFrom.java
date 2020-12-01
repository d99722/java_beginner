package lec9;

public class PersonFrom extends Person {
	
	private String city;
	
	public PersonFrom(String n, String c) {
		super(n);
		city = c;
	}
	
	public String getCity() {
		return city;
	}
	
	public boolean same(PersonFrom other) {
		return sameName(other) && city.equals(other.getCity());
	}
	
	
	public static void main(String[] args) {
		PersonFrom x = new PersonFrom("마음", "안산");
		System.out.println("이름 : "+x.getName());
		System.out.println("출신 : "+x.getCity());
		
		Person p = new Person("마음");
		Person q = new PersonFrom("소리","서울");
		
		System.out.println(p.sameName(q));
		Person x1 = q;
		System.out.println(x1.getName());
//		PersonFrom x2 = p; // error
//		System.out.println(x2.getCity()); error
		Person x3 = q;
//		System.out.println(x3.getCity()); error
//		System.out.println(q.same(p)); error
		
	}

}
