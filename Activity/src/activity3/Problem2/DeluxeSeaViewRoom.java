package activity3.Problem2;

public class DeluxeSeaViewRoom extends DeluxeRoom {

	public DeluxeSeaViewRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
	}

	public DeluxeSeaViewRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi,12);
	}
	
	
}
