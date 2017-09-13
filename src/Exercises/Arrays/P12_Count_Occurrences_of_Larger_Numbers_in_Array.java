package Exercises.Arrays;

import java.util.Scanner;

public class P12_Count_Occurrences_of_Larger_Numbers_in_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        double[] arr = new double[input.length];
        double num = Double.parseDouble(scanner.nextLine());
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            arr[i] = Double.parseDouble(input[i]);
            if (arr[i] > num){
                count++;
            }
        }
        System.out.println(count);
    }
}
