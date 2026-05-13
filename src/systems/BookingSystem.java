package systems;

public class BookingSystem {
	    private ArrayList<Booking> bookings = new ArrayList<>();

	    //Add booking
	    public void addBooking(Booking booking) {

	        bookings.add(booking);

	        System.out.println("Booking added successfully.");
	    }

	    //View bookings
	    public void viewBookings() {

	        if (bookings.isEmpty()) {

	            System.out.println("No bookings found.");
	            return;
	        }

	        for (Booking booking : bookings) {
	            booking.displayBooking();
	        }
	    }

	    //Cancel booking
	    public void cancelBooking(int bookingId) {

	        boolean found = false;

	        for (Booking booking : bookings) {

	            if (booking.getBookingId() == bookingId) {

	                bookings.remove(booking);

	                System.out.println("Booking cancelled successfully.");

	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Booking ID not found.");
	        }
	    }

	    // SEARCH BOOKING
	    public Booking searchBookingById(int bookingId) {

	        for (Booking booking : bookings) {

	            if (booking.getBookingId() == bookingId) {
	                return booking;
	            }
	        }

	        return null;
	    }
	}
}
