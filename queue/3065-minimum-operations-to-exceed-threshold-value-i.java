# 3065. Minimum Operations to Exceed Threshold Value I
# https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/

class Solution {
    public int minOperations(int[] nums, int k) {

        int move=0;

        for(int i=0 ;i<nums.length ; i++){
            if(nums[i]<k){
                move++;
            }
        }

        return move;
        
    }
}