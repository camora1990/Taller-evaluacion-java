package org.sofka.utilities;

import java.util.Scanner;

public class GetInput {
    private static final Scanner SCANNER = new Scanner(System.in);

    private GetInput() {
        throw new IllegalStateException("Utility class");
    }

    public static Integer getInteger() {
        try {
            return Integer.parseInt(SCANNER.nextLine());
        } catch (Exception exception) {
            return -99;
        }
    }

    public static String getString() {
        try {
            return String.valueOf(SCANNER.nextLine()).trim();
        } catch (Exception exception) {
            return null;
        }
    }

    public static Double getDouble() {
        try {
            return Double.parseDouble(SCANNER.nextLine());
        } catch (Exception exception) {
            return -99d;
        }
    }
}

