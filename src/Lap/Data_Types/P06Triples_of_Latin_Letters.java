package Lap.Data_Types;

import java.util.Scanner;

public class P06Triples_of_Latin_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (char i = 0; i < n; i++) {
            for (char c = 0; c < n; c++) {
                for (char j = 0; j < n; j++) {
                    char letter1 = (char) ('a' + i);
                    char letter2 = (char) ('a' + c);
                    char letter3 = (char) ('a' + j);

                    System.out.printf("%s%s%s\n", letter1, letter2, letter3);
                }
            }
        }
    }
}
