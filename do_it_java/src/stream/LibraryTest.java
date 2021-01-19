package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

class Book{
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
}

public class LibraryTest {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",15000));
		bookList.add(new Book("안드로이드",30000));
		
		int totalPrice = bookList.stream().mapToInt(book->book.getPrice()).sum();
		System.out.println("총 금액 : "+totalPrice+"원");
		
		
		
		bookList.stream().filter(book -> book.getPrice()>=20000).map(book -> book.getName()).sorted().forEach(bookName -> System.out.print(bookName+" "));
		
	}

}
