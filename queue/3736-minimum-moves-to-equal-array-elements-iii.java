# 3736. Minimum Moves to Equal Array Elements III
# https://leetcode.com/problems/minimum-moves-to-equal-array-elements-iii/

class Solution {
    public int minMoves(int[] nums) {


        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<nums.length ; i++){

            if(max <nums[i]){
                max=nums[i];
            }
        }

        int c=0;


         for(int i=0 ; i<nums.length ; i++){

           c+=(max-nums[i]);
        }

        return c;
    }
}