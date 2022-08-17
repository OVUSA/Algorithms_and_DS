package CrackingCodingInterview.Arrays;

import java.util.Arrays;

public class isIsomorphic {
    public static void main(String[] args) {
        String s = "foo";
        String t = "add";
        System.out.println(isIsomorphic(s,t));

    }

    public static boolean isIsomorphic(String s, String t) {
        // set a array for all  ASCII  characters
        int [] dic_s_t = new int[256];
        Arrays.fill(dic_s_t,-1);
        int [] dic_t_s = new int [256];
        Arrays.fill(dic_t_s,-1);

        for( int i =0;i<s.length();i++){
            char chS = s.charAt(i); // return ASCII number of the char
            char chT = t.charAt(i);

            // check if the sell is empty
            if(dic_s_t[chS]==-1 && dic_t_s[chT] ==-1){
               dic_s_t[chS]=chT;
               dic_t_s[chT]= chS;
            }
            else if(!(dic_s_t[chS]==chT&& dic_t_s[chT]==chS )){
                return false;
            }

        }

        return true;
    }
}
