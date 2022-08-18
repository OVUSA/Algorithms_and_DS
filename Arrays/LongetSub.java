package CrackingCodingInterview.Arrays;

import java.util.Arrays;

public class LongetSub {
    public static void main(String[] args) {

        /*
        * [100,4,200,1,3,2]  =>  4
            [0,3,7,2,5,8,4,6,0,1] =>9
            [0,0]=>1
            [0] =>1
        * */
    }
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){return 0;}
        if(nums.length==1){return 1;}
        Arrays.sort(nums);
        int dif = nums[1]-nums[0];
        int sequence = 2;
        int newSequence = 1;

        for ( int i = 0; i<nums.length-1; i++){
            if(nums[i+1]-nums[i]!=dif){
                dif = nums[i+1]-nums[i];
                newSequence = 1;
            }else{
                newSequence ++;

            }
            sequence = Math.max(newSequence,sequence);
        }

        return sequence;

    }
}
