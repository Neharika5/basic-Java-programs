import java.util.Scanner;

public class leapyear {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a year bhaiya: ");
        int year=sc.nextInt();
        if ((year%4==0) && (year%100!=0 || year%400==0)){
            System.out.print("leap year bhaiya ");
        }else{
            System.out.print("Not a leap year bhiaya");
        }
    }
}
