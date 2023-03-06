import java.util.Scanner;

public class HighestThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int n1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int n2 = scanner.nextInt();

        System.out.println("Enter the third number: ");
        int n3 = scanner.nextInt();

        int highest = n1;

        if (n2 > highest) {
            highest = n2;
        }

        if (n3 > highest) {
            highest = n3;
        }

        System.out.println("The highest of the three numbers is: " + highest);
    }
}
