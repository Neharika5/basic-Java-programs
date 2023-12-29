import java.util.Scanner;

public class armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number bhaiya:");
        int n=sc.nextInt();
        int r,temp,sum=0;
        temp=n;
        while(n>0){
            r=n%10;
            n=n/10;
            sum=(sum)+r*r*r;
        }
        if(temp==n){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
