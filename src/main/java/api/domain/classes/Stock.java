package api.domain.classes;

import java.util.UUID;

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
@Table(name = "stock")
public class Stock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID stockId;
	
	@NotBlank
	@Size(min = 3)
	@Column(name = "type", unique = false, nullable = false)
	private String type;
	
	@NotNull
	@Column(name = "current_stock", unique = false, nullable = false)
	private int currentStock;
	
	@NotNull
	@Column(name = "capacity", unique = false, nullable = false)
	private int capacity;
	
	public Stock() {}
	
	public Stock(String type, int currentStock, int capacity) {
		this.type = type;
		this.currentStock = currentStock;
		this.capacity = capacity;
	}

	public UUID getStockId() {
		return stockId;
	}

	public String getType() {
		return type;
	}

	public int getCurrentStock() {
		return currentStock;
	}

	public int getCapacity() {
		return capacity;
	}
}
