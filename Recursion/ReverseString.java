package Algorithms_and_DS.Recursion;

public class ReverseString {
    public static void main(String[] args) {
        char [] s = new char[]{'h','e','l','l','o'};
        reverseString(s);
    }
    public static void reverseString(char[] s){
        helper(s, s.length-1);


    }
    public static void helper(char [] s,int length){
        if(length==0){
            System.out.print(s[length]);
        }else{
            System.out.print(s[length]);
            helper(s,length-1);

        }
    }


}
