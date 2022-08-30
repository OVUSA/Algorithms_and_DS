package Algorithms_and_DS.SortAndSearch;

import java.util.ArrayList;
import java.util.Collections;

public class kthElement {
    public static void main(String[] args) {
        //Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
        //Output: 13

    }
    public int kthSmallest(int[][] matrix, int k) {
        if(k==1){return matrix[0][0];}

        ArrayList<Integer> ar = new ArrayList<>();

        for( int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix.length;j++){
                ar.add(matrix[i][j]);
            }
        }
        Collections.sort(ar);

        return ar.get(k-1);

    }
}
