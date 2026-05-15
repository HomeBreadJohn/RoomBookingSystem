package systems;

public class ValidationSystem {
	public boolean isValidRoomType(String roomType) {
		if (roomType == null) {
			return false;
		}

		String normalized = roomType.trim().toUpperCase();
		return normalized.equals("ROOM_A")
				|| normalized.equals("ROOM_B")
				|| normalized.equals("ROOM_C");
	}

	public boolean isValidPositiveInt(int value) {
		return value > 0;
	}
}
