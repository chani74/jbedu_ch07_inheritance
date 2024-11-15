package sec02.exam03;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		for ( int i=0 ; i<5 ; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
				case 1:
					System.out.println("FL Hankook Tire Change!");
					car.flTire = new HankookTire("FL", 15);
					break;
				case 2 :
					System.out.println("FR Kumho Tire Change!");
					car.frTire = new KumhoTire("FR", 13);
					break;
				case 3 :
					System.out.println("BL Hankook Tire Change!");
					car.blTire = new HankookTire("bl", 14);
					break;
				case 4 :
					System.out.println("br Kumho Tire Change!");
					car.brTire = new KumhoTire("br", 17);
					break;
			}
			System.out.println("-------------------------------------");
		}
	}

}
