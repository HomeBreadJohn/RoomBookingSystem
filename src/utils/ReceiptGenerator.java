//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class ReceiptGenerator {
    public ReceiptGenerator() {
    }

    public static void printReceipt(String name, String roomType, int nights, int total) {
        System.out.println("\n===== RECEIPT =====");
        System.out.println("Guest Name: " + name);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Total Payment: ₱" + total);
        System.out.println("===================\n");
    }

    public static String generateReceiptData(String name, String roomType, int nights, int total) {
        return name + "," + roomType + "," + nights + "," + total;
    }
}
