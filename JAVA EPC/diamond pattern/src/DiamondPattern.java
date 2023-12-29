import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();

        // Upper half of the diamond
        for (int i = 1; i <= rows; i += 2) {
            // Print spaces for indentation
            for (int j = 1; j <= rows - i; j += 2) {
                System.out.print(" ");
            }

            // Print stars for the upper half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = rows - 2; i >= 1; i -= 2) {
            // Print spaces for indentation
            for (int j = 1; j <= rows - i; j += 2) {
                System.out.print(" ");
            }

            // Print stars for the lower half
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
