import java.util.Scanner;

public class    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        int gcd = calculateGCD(a, b);
        int lcm = (a * b) / gcd;

        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        scanner.close();
    }

    // Function to calculate GCD using Euclid's algorithm
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
