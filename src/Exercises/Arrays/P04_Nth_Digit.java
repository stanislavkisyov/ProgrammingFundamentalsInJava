package Exercises.Arrays;

import java.util.Scanner;

public class P04_Nth_Digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(FindNthDigits(number, n));
    }

    private static int FindNthDigits(int numbers, int index) {

        int num = 0;
        while (index > 0){
            num = numbers % 10;
            numbers = numbers / 10;
            index--;
        }
        return num;
    }
}
