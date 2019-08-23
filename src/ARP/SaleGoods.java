package ARP;

public class SaleGoods {
	private String id;
	private int quantity;
	Customer customer;
	Retailer retailer;

	public SaleGoods(String id, int quantity, Customer customer, Retailer retailer) {
		this.id = id;
		this.quantity = quantity;
		this.customer = customer;
		this.retailer = retailer;
	}

	public void display() {
		System.out.println("Retailer who sale:");
		retailer.display();
		System.out.println("Selling to customer whose Info:");
		customer.display();
		System.out.println("Product Info. which sold:");
		System.out.println("ID:" + id + ",Quantity:" + quantity);
	}
}

