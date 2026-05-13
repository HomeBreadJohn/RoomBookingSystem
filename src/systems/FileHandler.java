//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    private static final String FILE_NAME = "bookings.txt";

    public FileHandler() {
    }

    public static void saveBooking(String data) {
        try (
                FileWriter fw = new FileWriter("bookings.txt");
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            bw.write(data);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving booking: " + e.getMessage());
        }

    }

    public static void loadBookings() {
        try (BufferedReader br = new BufferedReader(new FileReader("bookings.txt"))) {
            System.out.println("=== BOOKINGS ===");

            String line;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error loading bookings: " + e.getMessage());
        }

    }
}
