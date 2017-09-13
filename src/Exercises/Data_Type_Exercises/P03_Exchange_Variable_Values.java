package Exercises.Data_Type_Exercises;

import java.util.Scanner;

public class P03_Exchange_Variable_Values {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        int oldB = a;
        a = b;
        b = oldB;

        System.out.println(a);
        System.out.println(b);
    }

}
