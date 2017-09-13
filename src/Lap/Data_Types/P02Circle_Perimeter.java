package Lap.Data_Types;

import java.util.Scanner;

public class P02Circle_Perimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double area = Math.PI * 2 * r;
        System.out.printf("%.12f", area);
    }
}
