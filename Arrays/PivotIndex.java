package CrackingCodingInterview.Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        int [] nums = new int[]{-1,-1,0,0,-1,-1};

        System.out.println("the result is "+ pivotIndex(nums));
    }

    public static int pivotIndex(int [] nums) {
        int leftSum = 0; int sum = 0;

        for (int j : nums) {sum += j;}

        for (int i = 0; i < nums.length; i++) {
            if(leftSum == sum-leftSum-nums[i]){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }

/*
*         int sum=0;
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int j=0;j<nums.length;j++){
            if (leftsum == sum-leftsum-nums[j]){
                return j;
            }
            leftsum+=nums[j];
        }
        return -1;
    }*/
}
