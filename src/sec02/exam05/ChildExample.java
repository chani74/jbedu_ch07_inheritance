package sec02.exam05;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";	//타입변환으로 인해 자식 클래스 멤버와 메서드 사용 불가
//		parent.method3(); 
		
		Child child	= (Child) parent; //강제 타입 변환
		child.field2 = "YYY";			// 강제로 child 타입 변환 후, 보이지 않던 child의 멤버와 메서드가 사용가능해 졌다.
		child.method3();
			
	}
}
