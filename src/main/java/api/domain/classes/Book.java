package api.domain.classes;

import java.time.LocalDate;

public class Book {
	
	private long bookId;
	private String title;
	private String genre;
	private String synopsis;
	private int totalPages;
	private float rating;
	private LocalDate publishedDate;
	private float price;
	private boolean available;
	private long stockId;
	
	public Book() {}
	
	public Book(String title, String genre, String synopsis, int totalPages, LocalDate publishedDate,
			float price, long stockId) {
		this.title = title;
		this.genre = genre;
		this.synopsis = synopsis;
		this.totalPages = totalPages;
		this.publishedDate = publishedDate;
		this.price = price;
		this.stockId = stockId;
	}

	public long getBookId() {
		return bookId;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public float getRating() {
		return rating;
	}

	public LocalDate getPublishedDate() {
		return publishedDate;
	}

	public float getPrice() {
		return price;
	}

	public boolean isAvailable() {
		return available;
	}

	public long getStockId() {
		return stockId;
	}
}
