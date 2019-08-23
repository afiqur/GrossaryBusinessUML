package ARP;

public class OrderGoods {

	private String id;
	private int quantity;
	Distributor distributor;
	Retailer retailer;

	public OrderGoods(String id, int quantity, Distributor distributor, Retailer retailer) {
		this.id = id;
		this.quantity = quantity;
		this.distributor = distributor;
		this.retailer = retailer;
	}

	public void display() {
		System.out.println("Retailer who ordering:");
		retailer.display();
		System.out.println("Order to distributor whose Info:");
		distributor.display();
		System.out.println("Product Info. which ordered:");
		System.out.println("ID:" + id + ",Quantity:" + quantity);
	}

}

