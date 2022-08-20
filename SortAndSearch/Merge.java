package CrackingCodingInterview.SortAndSearch;

public class Merge {
    public static void main(String[] args) {
        int [] arr = new int[]{12,11,13,5,6,7};




    }

    public static void merge(){

    }
    //divide an array untill is one or no elements left
    public static int [] sort( int [] arr, int l, int right){
        int mid = l+(right- l)/2;

        sort(arr,l,mid);
        sort(arr,mid+1,right);

    }

}
