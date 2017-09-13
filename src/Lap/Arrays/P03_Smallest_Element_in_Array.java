package Lap.Arrays;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P03_Smallest_Element_in_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int[] nums = new int[input.length];

        int smallNum = Integer.MAX_VALUE;

        for (int i = 0; i < input.length; i++) {
            nums[i]= Integer.parseInt(input[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallNum){
                smallNum = nums[i];
            }
        }
        System.out.println(smallNum);


    }
}
