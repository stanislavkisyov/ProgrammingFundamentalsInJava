package Lap.Data_Types;

import java.util.Scanner;

public class P01Time_Since_Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = Integer.parseInt(scanner.nextLine());

        int days = years * 365;

        int hours = days * 24;

         int min = hours * 60;
        System.out.printf("%d years = %d days = %d hours = %d minutes.", years, days, hours, min);
    }
}
