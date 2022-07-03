package CrackingCodingInterview.Arrays;

import java.util.Arrays;
import java.util.Scanner;
// abcdef  --> fedcba
// abcnft --> abd_npngh
// rf ---> bnjhyjj

public class Permutation {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String st1 = sc.next();
       String st2 = sc.next();
      if(permutationCheck(st1,st2)){
          System.out.println(st1 +" is permutation of "+st2);
      }else{
          System.out.println("Sorry "+st1 +"is NOT permutation of "+st2);
      }
    }
// way 1
//    public static boolean permutationCheck(String st1, String st2){
//        if (st1.length()!=st2.length()){
//            return false;
//        }
//        char [] str2 = st2.toCharArray();
//        char [] str1 = st1.toCharArray();
//        Arrays.sort(str1);
//        Arrays.sort(str2);
//        for(int i = 0;i<st1.length();i++){
//            if(str1[i]!= str2[i]){
//                return false;
//            }
//        }
//        return true;
//    }

//// way 2
    public static String sort (String st ){
        char [] str = st.toCharArray();
        java.util.Arrays.sort(str);
        return new String(str);
    }

    static boolean permutationCheck(String st1, String st2){
        if(st1.length()!= st2.length()){
            return false;
        }
        return sort(st1).equals(sort(st2));
    }


}
