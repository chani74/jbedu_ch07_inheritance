package sec02.exam03;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotaion) {
		super(location, maxRotaion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulatedRation;
		if (accumulatedRation<maxRotaion) {
			System.out.println(location + " kumho Tire life : " + ( maxRotaion - accumulatedRation) );
			return true;
		} else {
			System.out.println("*** " + location + " kumho Tire Boom *** ");
			return false;
		}
	}
	
	
}
