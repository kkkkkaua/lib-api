package api.domain.classes;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private long bookId;
	
	@NotBlank
	@Size(min = 3)
	@Column(name = "title", unique = false, nullable = false)
	private String title;
	
	@NotBlank
	@Size(min = 3)
	@Column(name = "genre", unique = false, nullable = false)
	private String genre;
	
	@NotBlank
	@Size(min = 20)
	@Column(name = "synopsis", unique = false, nullable = false)
	private String synopsis;
	
	@NotNull
	@Column(name = "total_pages", unique = false, nullable = false)
	private int totalPages;
	
	@NotNull
	@Column(name = "rating", unique = false, nullable = false)
	private float rating;
	
	@NotNull
	@Column(name = "published_date", unique = false, nullable = false)
	private LocalDate publishedDate;
	
	@NotNull
	@Column(name = "price", unique = false, nullable = false)
	private float price;
	
	@NotNull
	@Column(name = "available", unique = false, nullable = false)
	private boolean available;
	
	@NotNull
	@Column(name = "stock_id", unique = false, nullable = false)
	private long stockId;
	
	public Book() {}
	
	public Book(String title, String genre, String synopsis, int totalPages, LocalDate publishedDate,
			float price, long stockId) {
		this.title = title;
		this.genre = genre;
		this.synopsis = synopsis;
		this.totalPages = totalPages;
		this.rating = 0;
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
