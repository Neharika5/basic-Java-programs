import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string bhaiya: ");
        String inputstring=sc.nextLine();
        String reverse= new StringBuilder(inputstring).reverse().toString();
        boolean ispalindrome=inputstring.equals(reverse);
        System.out.print(ispalindrome);

    }
}
