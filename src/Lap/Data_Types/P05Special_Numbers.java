package Lap.Data_Types;

import java.util.Scanner;

public class P05Special_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= n; num++) {
            int sumOfdigits = 0;

            int digits = num;

            while (digits > 0) {

                sumOfdigits = sumOfdigits + digits % 10;
                digits = digits / 10;
            }

            boolean special = (sumOfdigits == 5 || sumOfdigits == 7 || sumOfdigits ==11);
            System.out.printf("%s -> %s\n", num, special);
        }
    }
}
