package Algorithms_and_DS.FibonacciVar;

public class Tribonacci {
    public static void main(String[] args) {
        System.out.println(tribonacci(4));

    }
    public static int tribonacci(int n) {
        int z=0;
        int fir = 1;
        int sec = 1;
        int cur = 0;
        if(n==fir){return fir;}
        if(n==0){return 0;}
        if(n==2){return sec;}

        for( int i = 3;i<=n;i++){
            cur = fir+sec+z;
            z=fir;
            fir= sec;
            sec = cur;
        }

        return cur;

    }
}
