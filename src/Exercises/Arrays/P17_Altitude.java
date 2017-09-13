package Exercises.Arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class P17_Altitude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int damage =Integer.parseInt(input[0]);
        for (int i = 1; i < input.length - 1; i += 2) {
            String commands = input[i];
             Integer number = Integer.parseInt(input[i + 1]);
           if (commands.equals("up")){
               damage += number;
           } else if (commands.equals("down")){
               damage -= number;
           }
           if (damage <= 0){
               System.out.println("crashed");
               break;
           }
        }
        if (damage > 0){
            System.out.println("got through safely. current altitude: " + damage + "m");
        }
    }
}
