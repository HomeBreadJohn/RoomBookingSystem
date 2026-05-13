//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class PaymentSystem {
    public PaymentSystem() {
    }

    public static int computeTotal(String roomType, int nights) {
        int pricePerNight = 0;
        switch (roomType.toUpperCase()) {
            case "ROOM_A":
                pricePerNight = 500;
                break;
            case "ROOM_B":
                pricePerNight = 1000;
                break;
            case "ROOM_C":
                pricePerNight = 1500;
                break;
            default:
                System.out.println("Invalid Room Type.");
                return 0;
        }

        return pricePerNight * nights;
    }
}
