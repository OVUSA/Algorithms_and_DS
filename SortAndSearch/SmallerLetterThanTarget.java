package Algorithms_and_DS.SortAndSearch;

public class SmallerLetterThanTarget {
    //letter are wrapped around if target z return must be a or letters[0]
    public static void main(String[] args) {
        char [] let = new char[]{'c','f','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(let,target));

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0; int end = letters.length-1;

        while(start <= end){
            int mid = start+(end-start)/2;

            if(letters[mid]<=target ){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
        return letters[start%letters.length];

    }
}
