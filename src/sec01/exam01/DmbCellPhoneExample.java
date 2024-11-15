package sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","블랙", 10);
		// 생성자를 통해서 부모객체에서 물려받은 필드 2개까지  한번에 초기화
		
		// 상속 받은 필드
		System.out.println(dmbCellPhone.model);
		System.out.println(dmbCellPhone.color);
		
		// 자기 클래스의 필드
		System.out.println(dmbCellPhone.color);
		
		
		// 상받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("Hello~");
		dmbCellPhone.receiveVoice("Hi~! My name is chan!");
		dmbCellPhone.sendVoice("Hi");
		dmbCellPhone.hangUp();
		
		// 자기 클래스 매소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
	}

}
