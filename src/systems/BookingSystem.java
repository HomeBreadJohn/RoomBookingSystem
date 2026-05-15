package systems;

import java.util.ArrayList;
import java.util.Iterator;
import models.Booking;

public class BookingSystem {
	private final ArrayList<Booking> bookings = new ArrayList<>();

	public void addBooking(Booking booking) {
		bookings.add(booking);
		System.out.println("Booking added successfully.");
	}

	public void viewBookings() {
		if (bookings.isEmpty()) {
			System.out.println("No bookings found.");
			return;
		}

		for (Booking booking : bookings) {
			booking.displayBooking();
		}
	}

	public void cancelBooking(int bookingId) {
		boolean found = false;
		Iterator<Booking> iterator = bookings.iterator();

		while (iterator.hasNext()) {
			Booking booking = iterator.next();
			if (booking.getBookingId() == bookingId) {
				iterator.remove();
				System.out.println("Booking cancelled successfully.");
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Booking ID not found.");
		}
	}

	public Booking searchBookingById(int bookingId) {
		for (Booking booking : bookings) {
			if (booking.getBookingId() == bookingId) {
				return booking;
			}
		}

		return null;
	}
}
