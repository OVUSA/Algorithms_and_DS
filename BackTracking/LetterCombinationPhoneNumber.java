package Algorithms_and_DS.BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationPhoneNumber {
    public static void main(String[] args) {

    }
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();

        Map<String, String> dial = new HashMap<>();

        dial.put("2","abc");
        dial.put("3","def");
        dial.put("4","ghi");
        dial.put("5","jkl");
        dial.put("6","mno");
        dial.put("7","pqrs");
        dial.put("8","tuv");
        dial.put("9","wxyz");

        String first = dial.get(digits.charAt(0));

        for( int i = 0;i< first.length();i++){

        }


    }
}
