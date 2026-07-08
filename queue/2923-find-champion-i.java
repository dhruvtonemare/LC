# 2923. Find Champion I
# https://leetcode.com/problems/find-champion-i/

class Solution {
    public int findChampion(int[][] grid) {

        int place=0;
        int max_one=0;

        int row=grid.length;
        int col=grid[0].length;


        for(int i=0 ; i<row ; i++){

            int curr_one =0 ;
            int curr_place=i;

            for(int j=0 ; j<col ; j++){

                if(i!=j && grid[i][j]==1){
                    curr_one++;
                }

            
        }


        if(curr_one>max_one){
            max_one=curr_one;
            place=curr_place;
        }

        

        }

         return place;
        
        
    }
}