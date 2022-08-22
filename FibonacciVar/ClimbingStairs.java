package Algorithms_and_DS.FibonacciVar;

//given number of stairs
// you can step 1 or 2 stairs at a time , how many distinct ways you can climb up

public class ClimbingStairs {
    public static void main(String[] args) {

       System.out.println(clim(15));


    }


    public static int clim(int n){
        int st1 =1;
        int st2 = 2;
        int cur = 0;
        if(n<=1){
            return 1;
        }
        if(n<=2){return 2;}
        else{
            for( int i = 3;i<=n;i++){
                cur = st1+st2;
                st1=st2;
                st2=cur;

            }
        }
        return cur;
    }
}
