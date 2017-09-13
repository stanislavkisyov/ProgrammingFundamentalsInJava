package Exercises.Arrays;

import java.util.Scanner;

public class P09_Largest_Element_in_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
            if (arr[i] > temp){
                temp = arr[i];
            }
        }
        System.out.println(temp);

    }
}
