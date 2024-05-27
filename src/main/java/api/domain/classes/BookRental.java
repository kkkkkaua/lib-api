package api.domain.classes;

import java.time.LocalDate;

public class BookRental {

	private long bookRentalId;
	private LocalDate rentalStartDate;
	private LocalDate rentalEndDate;
	private float rentalFee;
	private float lateFee;
	private boolean returned;
	
	public BookRental(){}

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
