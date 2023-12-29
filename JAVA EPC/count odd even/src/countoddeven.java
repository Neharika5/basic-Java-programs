import java.util.Scanner;

public class countoddeven {
    public static void counts (int[] array){
        int oddcount=0;
        int evencount=0;
        for (int num: array){
            if(num%2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a size: ");
        int size=sc.nextInt();
        System.out.print("enter array numbers bhaiya: ");
        int [] number=new int[size];
        for (int i=0;i<size;i++){
            number[i]=sc.nextInt();

        }
        counts(number);

    }
}
