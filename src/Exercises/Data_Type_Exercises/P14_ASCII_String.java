package Exercises.Data_Type_Exercises;

import java.util.Scanner;

public class P14_ASCII_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String result = "";
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            char symbol = (char) num;
            result += symbol;
        }
            System.out.println(result);
    }
}
