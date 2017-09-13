package Exercises.Arrays;

import java.util.Scanner;

public class P18_Ballistics_Training {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] firePosition = new int[input.length];
        int x = 0, y = 0;

        String[] commands = scanner.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {
            firePosition[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < commands.length - 1; i += 2) {
            String command = commands[i];
            int number = Integer.parseInt(commands[i + 1]);

            if (command.equals("right")){
                x += number;
            } else if (command.equals("left")){
                x -=  number;
            } else if (command.equals("up")){
                y += number;
            } else if (command.equals("down")){
                y -= number;
            }
        }

        if (firePosition[0] == x && firePosition[1] == y){
            System.out.printf("firing at [%d, %d]\n got 'em!", x, y );
        }else {
            System.out.printf("firing at [%d, %d]\n better luck next time...", x, y);
        }
    }
}
