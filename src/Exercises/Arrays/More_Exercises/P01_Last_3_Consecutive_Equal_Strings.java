package Exercises.Arrays.More_Exercises;

import java.util.Scanner;

public class P01_Last_3_Consecutive_Equal_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String world = "";
        int count = 1;
        for (int i = input.length - 1; i > 0; i--) {
            if (input[i].equals(input[i - 1])){
                count++;
                world = input[i];
                if (count == 3){
                    break;
                }
            }
        }
        System.out.printf("%s %s %s", world, world, world);
    }
}
