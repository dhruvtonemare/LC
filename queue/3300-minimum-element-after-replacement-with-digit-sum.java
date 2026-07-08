# 3300. Minimum Element After Replacement With Digit Sum
# https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/

class Solution {
    public int minElement(int[] nums) {


        int s= Integer.MAX_VALUE;

        for(int i=0 ; i<nums.length ; i++){

            int curr= nums[i];

            int sum=0;

            while(curr>0){

            sum+= curr%10;
            curr/=10;

            }

            s= Math.min(sum,s);
        }


        return s;
        
    }
}