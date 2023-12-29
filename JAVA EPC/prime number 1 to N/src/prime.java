public class prime {
    public static void main(String[] args){
        int n ;
        int a[];
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            for(n=i;n>=1;n++){
                if (n % i == 0) {
                    count++;
                }
            }

        }
        if(count==2){
            a.add(n);


        }

System.out.println(a);

    }
}

