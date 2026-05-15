package models;

public class Booking {
    private int bookingId;
    private String customerName;
    private String roomType;
    private int nights;
    private int totalPayment;

    public Booking(
            int bookingId,
            String customerName,
            String roomType,
            int nights,
            int totalPayment) {

        this.bookingId = bookingId;
        this.customerName = customerName;
        this.roomType = roomType;
        this.nights = nights;
        this.totalPayment = totalPayment;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNights() {
        return nights;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

	public void displayBooking() {
		System.out.println("Booking ID: " + bookingId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Room Type: " + roomType);
		System.out.println("Nights: " + nights);
		System.out.println("Total Payment: " + totalPayment);
		System.out.println("---------------------------");
	}
}