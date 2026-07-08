# 3232. Find if Digit Game Can Be Won
# https://leetcode.com/problems/find-if-digit-game-can-be-won/

class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>9)
            {
                sum1 += nums[i];
            }
            else
            {
                sum2 += nums[i];
            }
        }
        
        return sum1 != sum2;
    }
}