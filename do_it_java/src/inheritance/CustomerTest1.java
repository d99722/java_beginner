package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10, "2");
		customerLee.setCustomerID(10010);		// *
		customerLee.setCustomerName("이순신");	// * : protected 이므로 set 메서드 호출
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(20, "ㅁ",2);
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		

	}

}
