package sec02.exam03;

public class Car {
	// field
	Tire flTire = new Tire("FL",6);
	Tire frTire = new Tire("FR",2);
	Tire blTire = new Tire("bl",3);
	Tire brTire = new Tire("br",4);
	
	//method
	int run () {
		System.out.println("running..");
		if(flTire.roll()==false) {stop();return 1;}
		if(frTire.roll()==false) {stop();return 2;}
		if(blTire.roll()==false) {stop();return 3;}
		if(brTire.roll()==false) {stop();return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("stop!");
	}
}
