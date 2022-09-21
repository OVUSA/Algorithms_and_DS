package Algorithms_and_DS.Arrays;

import java.util.*;

public class ReduceSize {
    public static void main(String[] args) {
        int [] arr = new int[]{3,3,3,3,5,5,5,2,2,7};
        int[] arr1 = new int[]{7,7,7,7,7,7};
        int [] arr2= new int[] {1000,1000,3,7};

        System.out.println(minSetSize(arr));
    }

    public static int minSetSize(int[] arr){
        int numbersRemove=0;
        Map<Integer, Integer> mp = new HashMap<>();
        for( int i =0;i< arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
        int count = 0;
        List<Integer> list = new ArrayList<>(mp.values());
        Collections.sort(list, Collections.reverseOrder());
        for(Integer i: list){
            if(count+i <arr.length/2){
                count+=i;
                numbersRemove+=1;
            }else{
                numbersRemove+=1;
                break;
            }
        }
        return numbersRemove;
    }
}
