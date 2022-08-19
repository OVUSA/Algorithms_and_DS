package CrackingCodingInterview.FibonacciVar;

public class minCostClimbingStairs {
    public static void main(String[] args) {
        int [] cost = new int [] {10,15,20};
        System.out.println(minCostClimbingStairs(cost));

    }
    public static int minCostClimbingStairs(int[] cost) {
        int first = cost[0];
        int second = cost[1];
        int cur = 0;
        if(cost.length==2){cur = Math.min(cost[0],cost[1]);}

        for(int i = 2;i<cost.length;i++){
            cur = cost[i]+Math.min(first,second);
            first = second;
            second=cur;

        }


        return Math.min(first,second);

    }
}
