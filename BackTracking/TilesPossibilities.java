package Algorithms_and_DS.BackTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TilesPossibilities {
    public static void main(String[] args) {
        System.out.println(numTilePossibilities("AAB"));

    }
    public static int numTilePossibilities(String tiles) {
        Set<String> st = new HashSet<>();
         numTilePossibilities(tiles,"",st);
         print(st);
        return st.size();

    }
//
    public static void numTilePossibilities(String tiles, String current, Set<String>st){
        if(current.length()>tiles.length()){
            return;
        }else {
            st.add(current);
            for (int i = 0; i < tiles.length(); i++) {
                if(!st.contains(current + tiles.charAt(i))){
                numTilePossibilities(tiles, current + tiles.charAt(i), st);}
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
