# 2016. Maximum Difference Between Increasing Elements
# https://leetcode.com/problems/maximum-difference-between-increasing-elements/

class Solution {
    public int maximumDifference(int[] nums) {

        Stack<Integer>s = new Stack<>();

        int diff=Integer.MIN_VALUE;

        for(int i=nums.length-1 ; i>=0 ; i--){
            if(s.isEmpty()){
                s.push(nums[i]);
            }

            else if(nums[i]>s.peek()){
                s.pop();
                s.push(nums[i]);
            }

            
            else if(nums[i]<s.peek()){
                 diff=Math.max(diff,s.peek()-nums[i]);
            }
        }

        if(diff ==Integer.MIN_VALUE ) return -1;

        return diff;
        
    }
}