package Algorithms_and_DS.BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        int [] ar = new int[]{1,2,3};
        print(permute(ar));


    }
    public static List<List<Integer>>permute(int [] nums){
        List<List<Integer>>ls = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        boolean [] usedSymb = new boolean[nums.length];
        Arrays.fill(usedSymb,false);
        return permute(nums,ls,usedSymb,temp,0);


    }
    private static List<List<Integer>>permute(int [] nums, List<List<Integer>> ls, boolean[] used, List<Integer>temp, int i){
        if(temp.size()>nums.length){
            ls.add(new ArrayList<>(temp));
        }else{
            for( int i =0;i< nums.length;i++){

            }
            permute(nums, ls,used,temp.add(nums[i]),i+1 );

        }


     }

    public static void print(List<List<Integer>>ar){
        for(List i:ar){
            for(Object j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*
* 1,2,3
*
*
*
*
*
* */
