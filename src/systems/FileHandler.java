package systems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandler {
        private static final String FILE_NAME = "src/data/bookings.txt";
        private static final Path FILE_PATH = Paths.get(System.getProperty("user.dir"))
            .resolve(FILE_NAME)
            .toAbsolutePath();

    public static void saveBooking(String data) {
        try (
                FileWriter fw = new FileWriter(FILE_PATH.toFile(), true);
                BufferedWriter bw = new BufferedWriter(fw)
        ) {
            bw.write(data);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error saving booking: " + e.getMessage());
        }

    }

    public static void loadBookings() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH.toFile()))) {
            System.out.println("=== BOOKINGS ===");

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error loading bookings: " + e.getMessage());
        }

    }
}
