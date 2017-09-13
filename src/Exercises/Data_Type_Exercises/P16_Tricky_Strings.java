package Exercises.Data_Type_Exercises;

import java.util.Scanner;

public class P16_Tricky_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String delimiter = scanner.nextLine();

        int n = Integer.parseInt(scanner.nextLine());

        String result = "";

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();

            result +=text;
            if (i == n - 1){
                break;
            }
            result += delimiter;
        }
        System.out.println(result.trim());
    }
}
