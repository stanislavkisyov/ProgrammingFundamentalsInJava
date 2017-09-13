package Lap.Data_Types;

import java.util.Scanner;

public class P07Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();

        int years = Integer.parseInt(scanner.nextLine());

        System.out.printf("Hello, %s %s. You are %d years old.\n", firstName, lastName, years);
    }

}
