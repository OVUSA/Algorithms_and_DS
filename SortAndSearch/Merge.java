package Algorithms_and_DS.SortAndSearch;

public class Merge {
    public static void main(String[] args) {
        int [] arr = new int[]{12,11,13,5,6,7};




    }

    public static void merge(){

    }
    //divide an array until is one or no elements left
    public static void sort( int [] arr, int left, int right){

        if(left<right) {
            int mid = left + (right - left) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);
        }
    }

}
