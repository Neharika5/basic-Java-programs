import java.util.Scanner;

public class WordCounter {
    public static int countWords(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence to count words:");
        String text = scanner.nextLine();

        int wordCount = countWords(text);
        System.out.println("Total words: " + wordCount);

        scanner.close();
    }
}
