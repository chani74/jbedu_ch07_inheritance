package sec01.exam01;

public class CellPhone {
	// field
	String model;
	String color;
	
	// creator
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	// method
	void powerOn() {System.out.println("Trun on the power.");}
	void powerOff() {System.out.println("Trun off the power.");}
	void bell() {System.out.println("Bell.");}
	void sendVoice(String message) {System.out.println("me:"+message);}
	void receiveVoice(String message) {System.out.println("you:"+message);}
	void hangUp() {System.out.println("Hang up the phone.");}
	
}
