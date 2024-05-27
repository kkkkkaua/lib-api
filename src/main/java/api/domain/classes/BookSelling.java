package api.domain.classes;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "book_selling")
public class BookSelling {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID bookSellingId;
	
	@NotNull
	@Column(name = "book_id", unique = true, nullable = false)
	private long bookId;
	
	@NotNull
	@Column(name = "customer_id", unique = false, nullable = false)
	private long customerId;
	
	@NotNull
	@Column(name = "selling_date", unique = false, nullable = false)
	private LocalDate sellingDate;
	
	public BookSelling() {}

	public BookSelling(long bookId, long customerId, LocalDate sellingDate) {
		this.bookId = bookId;
		this.customerId = customerId;
		this.sellingDate = sellingDate;
	}

	public UUID getBookSellingId() {
		return bookSellingId;
	}

	public long getBookId() {
		return bookId;
	}

	public long getCustomerId() {
		return customerId;
	}

	public LocalDate getSellingDate() {
		return sellingDate;
	}
}
