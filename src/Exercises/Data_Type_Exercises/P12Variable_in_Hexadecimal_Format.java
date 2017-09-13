package Exercises.Data_Type_Exercises;

import java.util.Scanner;

public class P12Variable_in_Hexadecimal_Format {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        int value = Integer.parseInt(input, 16);
        System.out.println(value);

        // Нещо гърми тука;

    }
}
