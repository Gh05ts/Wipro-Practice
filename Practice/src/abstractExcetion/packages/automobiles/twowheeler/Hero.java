package abstractExcetion.packages.automobiles.twowheeler;

public class Hero extends abstractExcetion.packages.automobiles.Vehicle {
	
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	
	public Hero(String modelName, String registrationNumber, String ownerName, int speed) {
//		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}
	
//	@Override
	public String getModelName() {
		return modelName;
	}

//	@Override
	public String getRegistrationNumber() {
		return registrationNumber;
	}

//	@Override
	public String getOwnerName() {
		return ownerName;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void radio() {
		System.out.println("Accessing the radio");
	}

}
