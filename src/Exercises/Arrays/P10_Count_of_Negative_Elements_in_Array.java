package Exercises.Arrays;

import java.util.Scanner;

public class P10_Count_of_Negative_Elements_in_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int negative = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
            if (arr[i] < 0){
                negative++;
            }
        }
        System.out.println(negative);
    }
}
