# 1800. Maximum Ascending Subarray Sum
# https://leetcode.com/problems/maximum-ascending-subarray-sum/

class Solution {
    public int maxAscendingSum(int[] nums) {

        int max= nums[0];

        int curr=nums[0];

        for(int i=1 ; i<nums.length; i++){

            if(nums[i]<=nums[i-1]){
                max= Math.max(curr,max);
                curr=nums[i];
            }
            else{
            curr+=nums[i];
            }
            
        }
         max= Math.max(curr,max);


         return max;

        
    }
}