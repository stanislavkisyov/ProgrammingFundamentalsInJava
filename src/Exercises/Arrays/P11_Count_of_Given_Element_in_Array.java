package Exercises.Arrays;

import java.util.Scanner;

public class P11_Count_of_Given_Element_in_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[input.length];

        int count = 0;
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
            if (arr[i] == n){
                count++;
            }
        }
        System.out.println(count);
    }
}
