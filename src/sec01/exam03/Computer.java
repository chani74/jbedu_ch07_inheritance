package sec01.exam03;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer object's areaCircel excute.");
		return Math.PI * r * r;
	}
}
