# 3423. Maximum Difference Between Adjacent Elements in a Circular Array
# https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/

class Solution {
    public int maxAdjacentDistance(int[] nums) {


        int max =Integer.MIN_VALUE;

        for(int i=1 ; i<nums.length ; i++){

            int curr =0;

            if(i == nums.length -1){
                int r= Math.abs(nums[nums.length-1]-nums[0]);
                int n= Math.abs(nums[i]-nums[i-1]);
                curr = Math.max(r,n);
            }

            else {
                curr = Math.abs(nums[i]-nums[i-1]);
            }

            max = Math.max(curr,max);
        }


        return max;

        
    }
}