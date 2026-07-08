# 11. Container With Most Water
# https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {


        int maxWater = Integer.MIN_VALUE;

    

        int i = 0;
        int j = height.length-1;

        
       
       while( i<j){
        

        //calculating and comapring the water area

        int Height = Math.min(height[i], height[j]);

        int width = j-i;


        int curr_area=  Height*width;

        maxWater= Math.max(maxWater, curr_area);


         if(height[i]<height[j]){

            i++;
         }
         else{j--;}

       }

       return maxWater;

        
    }
}