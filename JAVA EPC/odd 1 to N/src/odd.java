import java.util.Scanner;

public class odd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number bhaiya: ");
        int N=sc.nextInt();
        for(int i=2;i<=N;i++){
            if(i%2!=0){
                System.out.println("odd "+ i);
            }


        }
    }
}
