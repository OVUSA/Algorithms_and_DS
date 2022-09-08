package Algorithms_and_DS.Recursion;

public class RecursionPractice {
    public static void main(String[] args) {
        writeStart(10);

    }
    public  static void writeStart(int n){
        if(n==0){
            System.out.println();
        }else{
            System.out.print("* ");
            writeStart(n-1);
        }
    }

}
