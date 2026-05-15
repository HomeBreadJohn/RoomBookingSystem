package systems;

import utils.Constants;

public class PaymentSystem {
	public static int computeTotal(String roomType, int nights) {
		int pricePerNight = 0;
		switch (roomType.toUpperCase()) {
			case "ROOM_A":
				pricePerNight = Constants.ROOM_A_PRICE;
				break;
			case "ROOM_B":
				pricePerNight = Constants.ROOM_B_PRICE;
				break;
			case "ROOM_C":
				pricePerNight = Constants.ROOM_C_PRICE;
				break;
			default:
				System.out.println("Invalid Room Type.");
				return 0;
		}

		return pricePerNight * nights;
	}
}
