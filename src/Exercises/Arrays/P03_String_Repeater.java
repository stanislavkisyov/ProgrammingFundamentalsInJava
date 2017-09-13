package Exercises.Arrays;

import java.util.Scanner;

public class P03_String_Repeater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(RepeatText(input, count));
    }

    private static String RepeatText(String input, int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text += input;
        }
        return text;
    }
}
