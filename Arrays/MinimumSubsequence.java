package Algorithms_and_DS.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSubsequence {
    public static void main(String[] args) {

    }
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        if(nums.length<=2 ){
            for(int x: nums){
                arr.add(x);}
            ;}

        else{
            Arrays.sort(nums);
            int sum = 0;
            for(int i: nums){
                sum+=i;
            }

            int lstSum = 0;

            for(int j = nums.length-1;j>0; j--){
                if(lstSum<=sum){
                    sum-=nums[j];
                    lstSum+=nums[j];
                    arr.add(nums[j]);
                }
            }

        }


        return arr;
    }

}
