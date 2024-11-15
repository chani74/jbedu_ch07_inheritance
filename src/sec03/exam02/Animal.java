package sec03.exam02;

public abstract class Animal {
	public String kind;
	
	public Animal() {
		super();
	}

	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}

