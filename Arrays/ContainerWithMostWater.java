package Algorithms_and_DS.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] arr = new int [] {1,8,6,2,5,4,8,3,7};
        maxArea(arr);

    }
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int maxWater = 0;

        if(height.length == 2){
            int waterLevel = Math.min(height[0],height[1]);
            maxWater = waterLevel*1;

        }
        while(i<j){

            int waterLevel = Math.min(height[i],height[j]);
            if(waterLevel * (j-i)>maxWater){
                maxWater = waterLevel * (j-i);
            }
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxWater;
    }
}

