package Lap.Arrays;

import java.util.Scanner;

public class P06_Odd_Numbers_at_Odd_Positions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0 && nums[i] % 2 != 0) {
                System.out.printf("Index %d -> %d\n", i, nums[i]);
            }
        }
    }
}
