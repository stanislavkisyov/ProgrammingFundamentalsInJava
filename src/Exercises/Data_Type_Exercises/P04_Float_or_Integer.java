package Exercises.Data_Type_Exercises;

import java.util.Scanner;

public class P04_Float_or_Integer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());
        System.out.println(Math.round( num));
    }
}
