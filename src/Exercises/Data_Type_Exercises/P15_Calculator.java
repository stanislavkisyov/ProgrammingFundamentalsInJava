package Exercises.Data_Type_Exercises;

import java.util.Scanner;

public class P15_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int operand1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int operand2 = Integer.parseInt(scanner.nextLine());

        int result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;

            case "-":
                result = operand1 - operand2;
                break;

            case "*":
                result = operand1 * operand2;
                break;

            case "/":
                result = operand1 / operand2;
                break;
        }
        System.out.printf("%d %s %d = %d", operand1, operator, operand2, result);
    }
}
