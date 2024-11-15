package sec01.exam;

public class Triangle extends Shape {

	
	
	public Triangle(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println (width*height*0.5);
//		super.area();
	}




	
}
