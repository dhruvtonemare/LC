# 2239. Find Closest Number to Zero
# https://leetcode.com/problems/find-closest-number-to-zero/

class Solution {
    public int findClosestNumber(int[] nums) {

        int dist=nums[0];

        for(int i =0; i<nums.length ; i++){

            if(Math.abs(nums[i])< Math.abs(dist)){
                dist= nums[i];
            }
            else if (Math.abs(nums[i]) == Math.abs(dist) && nums[i] > dist) {
                dist = nums[i];
            }
        }
        return dist;
    }
}