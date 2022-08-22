package Algorithms_and_DS.Arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        int [] arr = new int [] {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(arr));

    }

    public static int lastStoneWeight(int[] stones) {

        Arrays.sort(stones);

        PriorityQueue<Integer> qu = new PriorityQueue<>();
        for(int i : stones){qu.add(i);}

        while(qu.size()>1){
            int x = qu.poll();
            int y = qu.poll();

            if(x!=y){
                y=y-x;
                qu.add(y);
            }
        }

        return qu.peek();

    }
}
