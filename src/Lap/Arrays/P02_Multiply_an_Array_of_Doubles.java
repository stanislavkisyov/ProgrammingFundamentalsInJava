package Lap.Arrays;

import java.util.Scanner;

public class P02_Multiply_an_Array_of_Doubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double p = Double.parseDouble(scanner.nextLine());

        String[] array = input.split(" ");
        double[] result = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = Double.parseDouble(array[i]);
        }

        for (int i = 0; i < result.length; i++) {
            System.out.printf("%.2f ",result[i] * p);
        }
    }
}
