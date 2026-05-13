package systems;

public class Booking {
	private int bookingId;
	private String customerName;
	private String roomType;
	private int hours;
	private int totalPayment;
	
public Booking (
	int bookingId,
	String customerName,
	String roomType,
	int hours,
	int totalPayment) {
	
		this.bookingId = bookingId;
		this.customerName = customerName;
		this.roomType = roomType;
		this.hours = hours;
		this.totalPayment = totalPayment;
}

	public int getBookingId() {
		return bookingId; 
	}
	
	public String customerName() {
		return customerName; 
	}
	
	public String roomType() {
		return roomType; 
	}
	
	public int hours() {
		return hours; 
	}
	
	public int totalPayment() {
		return totalPayment; 
	}
}




}
