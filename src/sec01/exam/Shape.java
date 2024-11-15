package sec01.exam;

public class Shape {

	int width;
	int height;
	
	
	public Shape() {
		super();
	}


	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}


	public void area() {
		System.out.println (width*height);
	}
}
