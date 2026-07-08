# 3142. Check if Grid Satisfies Conditions
# https://leetcode.com/problems/check-if-grid-satisfies-conditions/

class Solution {
    public boolean satisfiesConditions(int[][] grid) {


        for(int i=0 ; i<grid.length ; i++){

            for(int j=0 ; j<grid[0].length ; j++){

                int curr = grid[i][j];


                if(i!=grid.length-1 &&  curr!=grid[i+1][j]  ){

                    return false;
                }

                if(j!=grid[0].length-1 &&  curr==grid[i][j+1]  ){

                    return false;
                }



            


        }

            


        }


        return true;
        
    }
}