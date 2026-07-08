# 2535. Difference Between Element Sum and Digit Sum of an Array
# https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/

class Solution {
    public int differenceOfSum(int[] nums) {


        int a= 0;

        for(int i=0 ; i<nums.length ; i++){
            a+=nums[i];
        }

        int d=0;

        for(int i=nums.length -1 ; i>=0  ; i--){
            int curr = nums[i];
            while(curr>0){
                int l = curr%10;
                d+=l;
                curr/=10;
            }
        }

        return Math.abs(a-d);
        
    }
}