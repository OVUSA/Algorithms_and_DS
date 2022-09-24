package Algorithms_and_DS.SortAndSearch;

// return the highest pick of the mountain
// 852. Peak Index in a Mountain Array
public class Mountain {
    public static void main(String[] args) {
        int []nums = new int[]{0,10,8,9,5,0};
        System.out.println( peakIndexInMountainArray(nums));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int max=0;
        if(arr.length==3){
            if(arr[1]>arr[0]&& arr[1]> arr[2]){
                return 1;
            }
        }else{

            for ( int i = 1; i < arr.length-1;i++){
                if(arr[i-1]<arr[i]&& arr[i]> arr[i+1]){
                    if(arr[max]<arr[i]){
                        max = i;
                    }

                }
            }
        }
        return max;
    }
}
