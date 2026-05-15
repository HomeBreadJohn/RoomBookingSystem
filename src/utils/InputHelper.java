package utils;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = SCANNER.nextLine();

            try {
                return Integer.parseInt(input.trim());
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    public static String readString(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextLine();
    }

    public static String readNonEmptyString(String prompt) {
        while (true) {
            String value = readString(prompt);
            if (!value.trim().isEmpty()) {
                return value.trim();
            }
            System.out.println("Value cannot be empty.");
        }
    }
}
