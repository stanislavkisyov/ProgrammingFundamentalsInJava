package Exercises.Arrays;

import java.util.Scanner;

public class P14_Equal_Sequence_of_Elements_in_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] arr = new int[input.length];
        boolean same = true;

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] == arr[j + 1]) {
                same = false;
            }
        }
        System.out.println(same ? "No" : "Yes");
    }
}

