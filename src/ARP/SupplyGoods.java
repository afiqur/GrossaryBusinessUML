package ARP;

public class SupplyGoods {

	private String id;
	private int quantity;
	Distributor distributor;
	Retailer retailer;

	public SupplyGoods(String id, int quantity, Distributor distributor, Retailer retailer) {

		this.id = id;
		this.quantity = quantity;
		this.distributor = distributor;
		this.retailer = retailer;
	}

	public void display() {
		System.out.println("Distributor who supply:");
		distributor.display();
		System.out.println("supplied to Retailer whose Info:");
		retailer.display();
		System.out.println("Product Info. which supplied:");
		System.out.println("ID:" + id + ",Quantity:" + quantity);
	}

}

