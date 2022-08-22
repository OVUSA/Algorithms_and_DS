package Algorithms_and_DS.SortAndSearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5};
        int target = 5;
        System.out.println(search(arr,target));

    }
    public static int search(int [] nums, int target){
        int start = 0; int end = nums.length-1;

        if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }else{
                return -1;
            }
        }

        while(start<=end){
            int mid = start+(end -start)/2;
            if(nums[mid]==target){return mid;}
            if(nums[mid]<target){
                start =mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;

    }
}
