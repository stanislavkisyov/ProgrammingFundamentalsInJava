package Exercises.Arrays.More_Exercises;

import java.util.Scanner;

public class P02_Array_Elements_Equal_to_Their_Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        for (int i = 0; i <= input.length - 1; i++) {
            int temp = Integer.parseInt(input[i]);
            if (temp == i){
                System.out.print(temp + " ");
            }
        }
    }
}
