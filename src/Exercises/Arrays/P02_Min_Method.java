package Exercises.Arrays;

import java.util.Scanner;

public class P02_Min_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        GetMin(num1,num2, num3);
    }

    private static void GetMin(int num1, int num2, int num3) {

        System.out.println(Math.min(Math.min(num1, num2), num3));
    }
}
