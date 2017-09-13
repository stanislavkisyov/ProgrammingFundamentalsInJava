package Exercises.Arrays;

import java.util.Scanner;

public class P13_Increasing_Sequence_of_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] arrayOfNums = new int[input.length];
        boolean no = false;

        for (int i = 0; i < input.length; i++) {
            arrayOfNums[i] = Integer.parseInt(input[i]);
        }

        GetIncreasing(arrayOfNums, no);

    }

    private static void GetIncreasing(int[] arrayOfNums, boolean no) {
        for (int i = 1; i <= arrayOfNums.length - 1; i++) {

            if (arrayOfNums[i - 1] < arrayOfNums[i]) {
                no = true;
            } else {
                no = false;
                break;
            }
        }

        if (no){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
