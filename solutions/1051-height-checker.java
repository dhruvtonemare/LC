# 1051. Height Checker
# https://leetcode.com/problems/height-checker/

class Solution {
    public int heightChecker(int[] heights) {

        int [] res = new int[heights.length];

        for(int i=0 ;i<heights.length ; i++){
            res[i]= heights[i];
        }
        Arrays.sort(res);

        int check=0;

        for(int i=0 ;i<heights.length ; i++){
            if(res[i]!= heights[i]){
                check++;
            }
        }


        return check;

        
        
    }
}