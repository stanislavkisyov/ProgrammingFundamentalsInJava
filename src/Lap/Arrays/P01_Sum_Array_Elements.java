package Lap.Arrays;

import java.util.Scanner;

public class P01_Sum_Array_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        
        int[] arr = new int[n];
        int sum =0;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());

        }
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }

        System.out.println(sum);
    }
}
