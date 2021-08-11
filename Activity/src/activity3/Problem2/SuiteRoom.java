package activity3.Problem2;

public class SuiteRoom extends HotelRoom {

	private int ratePerSqFeet;

	public int getRatePerSqFeet() {
		if(getHasWifi())
			return (ratePerSqFeet+2);
		else 
			return ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}

	public SuiteRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	public SuiteRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
}
