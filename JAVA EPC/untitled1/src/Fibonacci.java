public class Fibonacci {
    public static void main(String[] args) {
        int limit = 10; // Change this value to generate Fibonacci sequence up to a different limit
        System.out.println("Fibonacci sequence up to " + limit + " terms:");

        int first = 0;
        int second = 1;

        for (int i = 1; i <= limit; ++i) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
