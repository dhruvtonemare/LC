# 1848. Minimum Distance to the Target Element
# https://leetcode.com/problems/minimum-distance-to-the-target-element/

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {

        int n=nums.length;

        if(nums[start]== target || n==1){
            return 0;
        }

        int dist = Integer.MAX_VALUE;

        int i =0 ; 

        while(i<n){

            if(nums[i]== target){
                dist = Math.min(dist, Math.abs(i-start));
            }

            i++;
        }




      

          
        return dist;
    }
}