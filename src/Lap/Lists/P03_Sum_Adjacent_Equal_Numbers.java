package Lap.Lists;

import java.util.*;

public class P03_Sum_Adjacent_Equal_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Double> result = new ArrayList<Double>();

        for (int i = 0; i < input.length; i++) {
            result.add(Double.parseDouble(input[i]));
        }

        for (int i = 1; i < result.size(); i++) {
            if (result.get(i).equals(result.get(i - 1))){
                result.set(i, result.get(i) * 2);
                result.remove(i - 1);
                i = 0;
            }
        }
        for (Double aDouble : result) {
            System.out.print(aDouble + " ");
        }
    }
}
