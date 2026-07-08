# 2529. Maximum Count of Positive Integer and Negative Integer
# https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/

class Solution {
    public int maximumCount(int[] nums) {

        int ng=0;

        int pv=0;

        for(int i=0 ; i<nums.length ; i++){

            if(nums[i]>0){
                pv++;
            }
            else if(nums[i]<0){
                ng++;
            }
        }


        return Math.max(pv,ng);
        
    }
}