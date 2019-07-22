package abstractExcetion.packages.automobiles;

public class Logan extends Vehicle{
	
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	private int gps;
	
	

	public Logan(String modelName, String registrationNumber, String ownerName, int speed, int gps) {
//		super();
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
		this.gps = gps;
	}

//	@Override
	public String getModelName() {
		return "modelName: " + modelName;
	}

//	@Override
	public String getRegistrationNumber() {
		return "registrationNumber: " + registrationNumber;
	}

//	@Override
	public String getOwnerName() {
		return "ownerName: " + ownerName;
	}
	
	public int speed() {
		return speed;
	}
	
	public int gps() {
		return gps;
	}

}
