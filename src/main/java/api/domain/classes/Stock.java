package api.domain.classes;

public class Stock {
	
	private long stockId;
	private String type;
	private int currentStock;
	private int capacity;
	
	public Stock() {}
	
	public Stock(String type, int currentStock, int capacity) {
		this.type = type;
		this.currentStock = currentStock;
		this.capacity = capacity;
	}

	public long getStockId() {
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
