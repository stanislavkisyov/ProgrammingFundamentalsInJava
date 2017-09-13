package Exercises.Arrays;

import java.util.Scanner;

public class P06_Notifications {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommand = Integer.parseInt(scanner.nextLine());


        while (numberOfCommand > 0) {

            String result = scanner.nextLine();
            String operation = scanner.nextLine();

            if (result.equals("success")) {
                String message = scanner.nextLine();
                System.out.println(ShowSuccess(operation, message));

            } else if (result.equals("error")) {

                int code = Integer.parseInt(scanner.nextLine());

                System.out.println(ShowError(operation, code));

            }
            numberOfCommand--;
        }
    }

    public static String ShowSuccess(String operation, String message) {

        String result = "Successfully executed " + operation + ".\n==============================\nMessage: " + message + ".";

        return result;
    }

    public static String ShowError(String operation, int code) {

        if (code > 0) {
            String result = "Error: Failed to execute " + operation + ".\n==============================\nError Code: " + code + ".\nReason: Invalid Client Data.";
            return result;
        }else {
            String result = "Error: Failed to execute " + operation + ".\n==============================\nError Code: " + code + ".\n" +
                    "Reason: Internal System Failure.";
            return result;
        }
    }
}