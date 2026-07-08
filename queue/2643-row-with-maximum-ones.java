# 2643. Row With Maximum Ones
# https://leetcode.com/problems/row-with-maximum-ones/

class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rn=0;

        int max=Integer.MIN_VALUE;


        int row =mat.length;
        int col=mat[0].length;

        for(int i=0 ; i<row ;i++){
             
             int curr=0;

            for(int j=0 ; j<col ;j++){
                
                if (mat[i][j]==1){
                    curr++;
                }
           
        } 
        if(curr>max){
            max=curr;
            rn=i;
        }
        }

        int [] result = new int[2];

        result[0]=rn;
        result[1]=max;

        return result;
        
    }
}