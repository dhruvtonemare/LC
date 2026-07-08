# 2293. Min Max Game
# https://leetcode.com/problems/min-max-game/

class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;
        
        // Base case: if the array has only 1 element, return it
        if (n == 1) {
            return nums[0];
        }
        
        // Create a new array of half the size for the next round
        int[] nextNums = new int[n / 2];
        
        for (int i = 0; i < nextNums.length; i++) {
            if (i % 2 == 0) {
                nextNums[i] = Math.min(nums[2 * i], nums[2 * i + 1]);
            } else {
                nextNums[i] = Math.max(nums[2 * i], nums[2 * i + 1]);
            }
        }
        
        // Recursively call the function with the compressed array
        return minMaxGame(nextNums);
    }
}