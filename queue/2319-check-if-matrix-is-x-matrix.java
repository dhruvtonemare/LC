# 2319. Check if Matrix Is X-Matrix
# https://leetcode.com/problems/check-if-matrix-is-x-matrix/

class Solution {
    public boolean checkXMatrix(int[][] grid) {

        int rows = grid.length;

        int cols = grid[0].length;


        for(int i =0 ; i<rows ; i++){

            for(int j=0 ; j<cols ; j++){

                if(i==j   ||  i+j == rows-1){

                    if(grid[i][j]==0  ){
                        return false;
                    }


                }

                

                else {

                    if(grid[i][j]!=0){
                    return false;

                }
                }

                
            }


        }


        return true;
    }
}