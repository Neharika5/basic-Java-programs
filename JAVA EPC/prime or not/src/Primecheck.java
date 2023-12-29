import java.util.Scanner;

public class Primecheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number bhaiya: ");
        int N=sc.nextInt();
        boolean isprime=true;
        if (N<=1){
            isprime=false;
        }else{
            for(int i=2;i<N;i++){
                if(N%i==0){
                    isprime=false;
                    break;
                }
            }
        }
        if (isprime) {
            System.out.print("prime bhaiya");
        }else{
            System.out.print("NOT PRIME BHAIYA");
        }
    }
}
