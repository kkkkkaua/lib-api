package api.domain.classes;

import java.time.LocalDate;

public class BookSelling {
	
	private long bookSellingId;
	private Book book;
	private Customer customer;
	private LocalDate sellingDate;
	
	public BookSelling() {}
	
	public BookSelling(Book book, Customer customer) {
		this.book = book;
		this.customer = customer;
		this.sellingDate = LocalDate.now();
	}

	public long getBookSellingId() {
		return bookSellingId;
	}

	public Book getBook() {
		return book;
	}

	public Customer getCustomer() {
		return customer;
	}

	public LocalDate getSellingDate() {
		return sellingDate;
	}
}
