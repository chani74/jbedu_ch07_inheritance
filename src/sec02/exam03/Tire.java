package sec02.exam03;

public class Tire {
	//field
	public int maxRotaion;			// 최대 회전수
	public int accumulatedRation;	// 누적 회전수
	public String location;			// 타이어의 위치
	
	// creator
	public Tire( String location, int maxRotaion) {
		super();
		this.maxRotaion = maxRotaion;
		this.location = location;
	}
	
	// method
	public boolean roll() {
		++accumulatedRation;
		if (accumulatedRation<maxRotaion) {
			System.out.println(location + " Tire life : " + ( maxRotaion - accumulatedRation) );
			return true;
		} else {
			System.out.println("*** " + location + " Tire Boom *** ");
			return false;
		}
	}
}
