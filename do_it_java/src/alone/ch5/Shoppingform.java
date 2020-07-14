package alone.ch5;

public class Shoppingform {
	String orderNumber;
	String id;
	String orderDate;
	String name;
	String code;
	String address;
	
	public static void main(String[] args) {
		Shoppingform n1 = new Shoppingform();
		n1.orderNumber = "201803120001";
		n1.id = "abc123";
		n1.orderDate = "2018년 3월 12일";
		n1.name = "홍길순";
		n1.code = "PD0345-12";
		n1.address = "서울시 영등포구";
		
		System.out.println("주문 번호 : "+n1.orderNumber);
		System.out.println("주문자 아이디 : "+n1.id);
		System.out.println("주문 날짜 : "+n1.orderDate);
		System.out.println("주문자 이름 : "+n1.name);
		System.out.println("주문 상품 번호 : "+n1.code);
		System.out.println("배송 주소 : "+n1.address);
		
	}
}
