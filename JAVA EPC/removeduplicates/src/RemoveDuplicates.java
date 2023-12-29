import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        // Removing duplicates
        if (length > 0) {
            int j = 1;
            for (int i = 1; i < length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[j] = nums[i];
                    j++;
                }
            }
            length = j;
        }

        System.out.println("Array with duplicates removed:");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
