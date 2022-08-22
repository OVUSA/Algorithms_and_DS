package Algorithms_and_DS.SortAndSearch;

public class BadVersion {

    public static void main(String[] args) {

    }
    public static int firstBadVersion(int n) {
        int start = 0;int end = n;
        if(n ==1){
            return 1;
        }else {
            while(start<=end){
                int mid = start+(end-start)/2;
                if(isBadVersion(mid)){helper(n,);}//right side
                if()
            }
        }

    }

    public int helper ( int n, int start, int end){

    }

    public boolean isBadVersion( int i){
        int badVersion = 5;
        return i==badVersion;
}

}
