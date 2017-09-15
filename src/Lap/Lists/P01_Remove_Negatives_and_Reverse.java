package Lap.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01_Remove_Negatives_and_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        List<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < input.length; i++) {
            if (Integer.parseInt(input[i]) > 0) {
                nums.add(Integer.parseInt(input[i]));
            }
        }

        if (nums.size() == 0) {
            System.out.println("empty");
        } else {
            for (int i = nums.size() - 1; i >= 0; i--) {
                System.out.print(nums.get(i) + " ");
            }
        }

    }
}
