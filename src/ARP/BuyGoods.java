package ARP;

public class BuyGoods {
	private String id;
	private int quantity;
	Customer customer;
	Retailer retailer;

	public BuyGoods(String id, int quantity, Customer customer, Retailer retailer) {
		this.id = id;
		this.quantity = quantity;
		this.customer = customer;
		this.retailer = retailer;
	}

	public void display() {
		System.out.println("Customer who Buy:");
		customer.display();
		System.out.println("From Retailer:");
		retailer.display();
		System.out.println("Product Info. which wants to Buy:");
		System.out.println("ID:" + id + ",Quantity:" + quantity);
	}
}

