import java.util.Scanner;

public class HollowRhombusPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print spaces for indentation
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print stars for the rhombus outline
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
