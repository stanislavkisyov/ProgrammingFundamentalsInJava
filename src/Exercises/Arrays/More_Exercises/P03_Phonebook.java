package Exercises.Arrays.More_Exercises;

import java.util.Scanner;

public class P03_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phoneBook = scanner.nextLine().split(" ");
        String[] names = scanner.nextLine().split(" ");

        while (true) {
            String currentName = scanner.nextLine();
            if (currentName.equals("done")) {
                break;
            }
            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(currentName)) {
                    System.out.println(names[i] + " -> " + phoneBook[i]);
                    break;
                }
            }
        }
    }
}
