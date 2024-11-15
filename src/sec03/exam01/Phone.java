package sec03.exam01;

public abstract class Phone {
	//field
	public String owner;

	//creator
	public Phone() {
		super();
	}

	public Phone(String owner) {
		this.owner = owner;
	}
	

	//method
	public void turnOn() {
		System.out.println("Turn on the Phone");
	}

	public void turnOff() {
		System.out.println("Turn off the Phone");
	}
}
