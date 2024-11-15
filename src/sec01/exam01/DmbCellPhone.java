package sec01.exam01;

public class DmbCellPhone extends CellPhone {
	// field
	int channel;

	// creator
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
	}


//	public DmbCellPhone(String model, String color , int channel) {
//		// TODO Auto-generated constructor stub
//		this.model = model ;
//		this.color= color ;
//		this.channel =  channel ;
//	}
//	
	

	// mehod
	void turnOnDmb() {
		System.out.println("Start receiving DMB on channel : " + channel);
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("Change channel to " + channel);
	}
	
	void turnOffDmb() {
		System.out.println("Stop receiving DMB");
	}


	
	
}
