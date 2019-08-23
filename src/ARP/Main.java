package ARP;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer("C1001", "0178237238", "customer@gmail.com");
		Retailer r = new Retailer("R1001", "0192833838", "retailer@outlook.com");
		Distributor d = new Distributor("D1001", "017273838", "distributor@ovimail.com");

		BuyGoods bg1 = new BuyGoods("BG1001", 70, c, r);
		bg1.display();

		OrderGoods og = new OrderGoods("OG1001", 100, d, r);
		og.display();

		SupplyGoods sg = new SupplyGoods("SG1001", 100, d, r);
		sg.display();

		SaleGoods slg = new SaleGoods("SLG1001", 70, c, r);
		slg.display();

	}

}

