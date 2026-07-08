# 1572. Matrix Diagonal Sum
# https://leetcode.com/problems/matrix-diagonal-sum/

class Solution {
    public int diagonalSum(int[][] mat) {

        int sum =0; 

        int rev =0;

        for(int i =0 ; i<mat.length ; i++){
            
            for(int j=0 ; j<mat[0].length ; j++){

                if(i==j || j+ rev == mat[0].length-1 ){

                    System.out.println(mat[i][j]);

                    sum+=mat[i][j];
                }


            }
            rev++;
        }

        return sum;
        
    }
}