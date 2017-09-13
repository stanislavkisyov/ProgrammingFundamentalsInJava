package Exercises.Arrays;

import java.util.Scanner;

public class P08_String_Encryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String result = "";

        while (n > 0) {
            char letter = scanner.nextLine().charAt(0);

            String encrypt = Encryption(letter);
            result += encrypt;
            n--;
        }
        System.out.println(result);
    }

    private static String Encryption(char letter) {
        int asciiCode = (int) letter;
        int firstDigits = GetFirstDigits(asciiCode);
        int lastDigits = GetLastDigits(asciiCode);

        char firstSymbol = (char) (asciiCode + lastDigits);
        char secondSymbol = (char) (asciiCode - firstDigits);

        String result = String.format("%s%s%s%s", firstSymbol, firstDigits, lastDigits, secondSymbol);
        return result;
    }

    private static int GetLastDigits(int asciiCode) {
        asciiCode %= 10;
        return asciiCode;
    }

    private static int GetFirstDigits(int asciiCode) {
        while (asciiCode >= 10) {
            asciiCode /= 10;
        }
        return asciiCode;
    }
}
