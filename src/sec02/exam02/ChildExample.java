package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();	// 예외적으로 오버라이딩 된 메소드 호출 가능
//		parent.method3(); // 호출 불가
	}

}
