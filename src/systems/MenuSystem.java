package systems;

import models.Booking;
import utils.InputHelper;
import utils.ReceiptGenerator;

public class MenuSystem {
	private final BookingSystem bookingSystem;
	private final ValidationSystem validationSystem;
	private int nextBookingId;

	public MenuSystem() {
		this.bookingSystem = new BookingSystem();
		this.validationSystem = new ValidationSystem();
		this.nextBookingId = 1;
	}

	public void start() {
		boolean running = true;

		while (running) {
			printMenu();
			int choice = InputHelper.readInt("Select an option: ");

			switch (choice) {
				case 1:
					createBooking();
					break;
				case 2:
					bookingSystem.viewBookings();
					break;
				case 3:
					cancelBooking();
					break;
				case 4:
					FileHandler.loadBookings();
					break;
				case 5:
					running = false;
					System.out.println("Goodbye!");
					break;
				default:
					System.out.println("Invalid option.");
			}
		}
	}

	private void printMenu() {
		System.out.println("\n=== ROOM BOOKING SYSTEM ===");
		System.out.println("1. Add booking");
		System.out.println("2. View bookings");
		System.out.println("3. Cancel booking");
		System.out.println("4. Load bookings from file");
		System.out.println("5. Exit");
	}

	private void createBooking() {
		String name = InputHelper.readNonEmptyString("Customer name: ");
		String roomType = InputHelper.readNonEmptyString("Room type (ROOM_A/ROOM_B/ROOM_C): ");

		if (!validationSystem.isValidRoomType(roomType)) {
			System.out.println("Invalid room type.");
			return;
		}

		int nights = InputHelper.readInt("Number of nights: ");
		if (!validationSystem.isValidPositiveInt(nights)) {
			System.out.println("Nights must be greater than 0.");
			return;
		}

		int total = PaymentSystem.computeTotal(roomType, nights);
		Booking booking = new Booking(nextBookingId, name, roomType, nights, total);

		bookingSystem.addBooking(booking);
		ReceiptGenerator.printReceipt(name, roomType, nights, total);

		String data = ReceiptGenerator.generateReceiptData(name, roomType, nights, total);
		FileHandler.saveBooking(data);

		nextBookingId++;
	}

	private void cancelBooking() {
		int bookingId = InputHelper.readInt("Booking ID to cancel: ");
		bookingSystem.cancelBooking(bookingId);
	}
}
