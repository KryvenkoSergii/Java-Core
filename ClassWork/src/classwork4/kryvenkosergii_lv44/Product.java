package classwork4.kryvenkosergii_lv44;

public class Product {

	private String name;
	private int price;
	private int quantitu;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantitu() {
		return quantitu;
	}

	public void setQuantitu(int quantitu) {
		this.quantitu = quantitu;
	}

	public Product() {
	}

	public Product(String name) {
		this.name = name;
	}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Product(String name, int price, int quantitu) {
		this.name = name;
		this.price = price;
		this.quantitu = quantitu;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantitu=" + quantitu + "]";
	}

}
