package Algorithms_and_DS.SortAndSearch;

public class BadVersion {
// every version after bad one is bad , find the very first one
    public static void main(String[] args) {
        System.out.println(firstBadVersion(20));

    }
    public static int firstBadVersion(int n) {

            int start = 0; int end =n;
            int res = n;

            if(n==1){return 1;}
            while(start<=end) {
                int mid = start + (end - start) / 2;
                if (!isBadVersion(mid)) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                    res = Math.min(res, mid);
                }
            }
            return res;
        }

    public static boolean isBadVersion(int i){
        int badVersion = 18;
        return i>=badVersion;
}

}
