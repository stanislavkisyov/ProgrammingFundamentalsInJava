package Exercises.Arrays;

import java.util.Scanner;

public class P05_IntegerToBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int toBase = Integer.parseInt(scanner.nextLine());
        String result = IntegerBase(number, toBase);
        System.out.println(result);
    }

    private static String IntegerBase(int number, int toBase) {
        String result = "";

        while (number > 0){
            int reminder = number % toBase;
            result = reminder + result;
            number /= toBase;
        }
        return result;
    }
}

