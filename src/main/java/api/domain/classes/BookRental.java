package api.domain.classes;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "book_rental")
public class BookRental {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private long bookRentalId;
	
	@NotNull
	@Column(name = "rental_start_date", unique = false, nullable = false)
	private LocalDate rentalStartDate;
	
	@NotNull
	@Column(name = "rental_end_date", unique = false, nullable = false)
	private LocalDate rentalEndDate;
	
	@NotNull
	@Column(name = "rental_fee", unique = false, nullable = false)
	private float rentalFee;
	
	@NotNull
	@Column(name = "late_fee", unique = false, nullable = false)
	private float lateFee;
	
	@NotNull
	@Column(name = "returned", unique = false, nullable = false)
	private boolean returned;
	
	public BookRental() {}
	
	public BookRental(LocalDate rentalStartDate, LocalDate rentalEndDate, float rentalFee,
			float lateFee) {
		this.rentalStartDate = rentalStartDate;
		this.rentalEndDate = rentalEndDate;
		this.rentalFee = rentalFee;
		this.lateFee = lateFee;
		this.returned = false;
	}

	public long getBookRentalId() {
		return bookRentalId;
	}

	public LocalDate getRentalStartDate() {
		return rentalStartDate;
	}

	public LocalDate getRentalEndDate() {
		return rentalEndDate;
	}

	public float getRentalFee() {
		return rentalFee;
	}

	public float getLateFee() {
		return lateFee;
	}

	public boolean isReturned() {
		return returned;
	}
}
