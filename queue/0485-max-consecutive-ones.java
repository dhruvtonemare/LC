# 485. Max Consecutive Ones
# https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {


    int max_one= Integer.MIN_VALUE;
    int curr_one = 0;


    for(int i = 0 ; i<nums.length;i++){

        if(nums[i]== 1){
            curr_one ++;

        }
        else{
            curr_one=0;

        }
        max_one = Math.max(max_one, curr_one);
    }

   return max_one;

        
    }
}