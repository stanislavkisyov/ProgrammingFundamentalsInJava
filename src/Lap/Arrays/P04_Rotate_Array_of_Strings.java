package Lap.Arrays;

import java.util.Scanner;

public class P04_Rotate_Array_of_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        String[] rotate = new String[input.length];

        rotate[0] = input[input.length - 1];

        for (int i = 0; i < input.length - 1; i++) {
            rotate[i + 1] = input[i];
        }
        for (String s : rotate) {
            System.out.print(s + " ");
        }
    }
}
