package sec02.exam03;

public class HankookTire extends Tire {

	public HankookTire(String location,int maxRotaion ) {
		super( location, maxRotaion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {
		// TODO Auto-generated method stub
		++accumulatedRation;
		if (accumulatedRation<maxRotaion) {
			System.out.println(location + " Hankook Tire life : " + ( maxRotaion - accumulatedRation) );
			return true;
		} else {
			System.out.println("*** " + location + " Tire Boom *** ");
			return false;
		}
	}

}
