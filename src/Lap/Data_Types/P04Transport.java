package Lap.Data_Types;

import java.util.Scanner;

public class P04Transport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n <= 24) {
            System.out.println(1);
        } else {
            System.out.println(Math.ceil(n / 24.0));
        }
    }
}
