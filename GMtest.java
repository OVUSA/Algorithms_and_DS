package Algorithms_and_DS;

import java.io.IOException;
import java.util.Scanner;

// given # of grams a robot should mine , the robot can clone itself which takes one day or can mine 1gram per day
// find minimum number of days to mins X grams

public class GMtest {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int grams = sc.nextInt();
        if(grams == 1){System.out.println(1);}
        if(grams ==0){System.out.println(0);}
        else{
            System.out.println(mineDays(grams));
        }

    }

    public static int mineDays(int n) {
        if (n==0){

        }else{
            return Math.max(mineDays(n-1)+1,(mineDays(n-1)+mineDays(n-2)));
        }
        return 0;
    }
}
