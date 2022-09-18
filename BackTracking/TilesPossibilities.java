package Algorithms_and_DS.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TilesPossibilities {
    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));

    }
    public static int numTilePossibilities(String tiles) {
        // add an array to keep a track of used characters when iterate through
        boolean [] usedChar = new boolean[tiles.length()];
        Arrays.fill(usedChar,false);
        Set<String> st = new HashSet<>();
         numTilePossibilities(tiles,"",st, usedChar);

        return st.size()-1;

    }
//
    public static void numTilePossibilities(String tiles, String current, Set<String>st,boolean[] used){
        if(current.length()>tiles.length()){
            return;
        }else {
            st.add(current);
            for (int i = 0; i < tiles.length(); i++) {
                if(used[i]!= true){
                    used[i]=true;
                    numTilePossibilities(tiles,current+tiles.charAt(i),st,used);
                    used[i]= false;

                }
            }
        }

    }

    public static void print(Set<String >st){
        for( String s :st){
            System.out.println(s+" ");
        }
        System.out.println();
    }
}
