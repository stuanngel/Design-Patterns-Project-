package SantaClausFactory;

public class Bike implements Factory {

	@Override
	public void create() {
		System.out.println("Create Bike!");
	}

}