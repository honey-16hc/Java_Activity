package activity3.Problem1;

public class TwoWheeler extends Vehicle {

	private Boolean kickStartAvailable;

	public Boolean getKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(Boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	
	
	public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc,
			Boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}

	public void displayDetailInfo() {
		System.out.println("Kick Start Available: " + kickStartAvailable );
	}
	
}
