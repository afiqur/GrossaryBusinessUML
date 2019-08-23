package ARP;

public class Distributor {

	private String id;
	private String cell;
	private String email;

	public Distributor(String id, String cell, String email) {
		this.id = id;
		this.cell = cell;
		this.email = email;
	}

	public void display() {
		System.out.println("ID:" + id + ",Cell:" + cell + ",Email:" + email);
	}

}

