package Algorithms_and_DS.Visa;

public class VisibleTowers {
    public static void main(String[] args) {
        int [] towers = new int[]{5,2,10,1};
        int n = 4;
        visibleTowers(n,towers);
    }
    public static int[] visibleTowers(int n, int[] towers){
        if(n==1){
            return new int[]{1};
        }else{
            if(towers[n]<towers[n-1]){

            }
        }
    }
    private static int[] visibleTowers(int n, int[] towers, int [] visibility){
        if(n!=1&& n!=towers.length){
            visibility[n]= visibility[n]+1;

        }else{
            if(towers[n]>towers[n-1]){
                visibleTowers(n-1, towers, visibility);
                visibility[n]=visibility[n]+1;
            }else{

            }
            if(towers[n]>towers[n-1]){

            }
        }
    }


}
