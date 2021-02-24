package vo;

public class Product {
	private String category;
	private String name;
	private int amount;
	private int price;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String category, String name, int amount, int price) {
		super();
		this.category = category;
		this.name = name;
		this.amount = amount;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
