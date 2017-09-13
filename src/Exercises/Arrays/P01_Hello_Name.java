package Exercises.Arrays;

import java.util.Scanner;

public class P01_Hello_Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        printGreader(name);
    }

    private static void printGreader(String name) {

        System.out.printf("Hello, %s!\n", name);
    }

}
