package Lap.Arrays;

import java.util.Scanner;

public class P05_Count_of_Odd_Numbers_in_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split(" ");
        int[] nums = new int[arr.length];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
