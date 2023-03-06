import java.util.*;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] numbers = {4, 6, 3, 9, 1, 8, 5, 2, 7};

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int n : numbers) {
            if (n > highest) {
                secondHighest = highest;
                highest = n;
            } else if (n > secondHighest && n != highest) {
                secondHighest = n;
            }
        }

        System.out.println("The second highest number is: " + secondHighest);
    }
}
