# 268. Missing Number
# https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {

        int curr=0;
        int n = nums.length;

        for(int i=0 ; i<n; i++){

            curr+=nums[i];
        }

        return ((n*(n+1))/2)-curr;
        




        
    }
}