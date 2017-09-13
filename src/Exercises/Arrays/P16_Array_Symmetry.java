package Exercises.Arrays;

import java.util.Scanner;

public class P16_Array_Symmetry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String strReversed = "";
        int length = input.length - 1;

        while (length >= 0) {
            strReversed += input[length];
            length--;
        }
        if (strReversed.equals(String.join("",input))){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
