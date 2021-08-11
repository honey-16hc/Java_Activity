package activity3.Problem2;

public class HotelRoom {

	private String hotelName ;
	private int numberOfSqFeet ;
	private Boolean hasTV ;
	private Boolean hasWifi ;
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}
	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}
	public Boolean getHasTV() {
		return hasTV;
	}
	public void setHasTV(Boolean hasTV) {
		this.hasTV = hasTV;
	}
	public Boolean getHasWifi() {
		return hasWifi;
	}
	public void setHasWifi(Boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
	public HotelRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff(int costPerSq) {
		int cost = numberOfSqFeet * costPerSq;
		return cost;
	}
	
	public int getRatePerSqFeet() {
		return 0;
	}
	
}
