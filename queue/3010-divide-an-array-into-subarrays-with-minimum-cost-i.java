# 3010. Divide an Array Into Subarrays With Minimum Cost I
# https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/

class Solution {
    public int minimumCost(int[] nums) {


        int cost =0;

        cost+=nums[0];

        int fm = Integer.MAX_VALUE;
        int sm = 0;

        for(int i=1 ; i< nums.length; i++){

            int current = nums[i];

            if(current<=fm  ){

                sm=fm;
                fm=current;

            }

            else if (current<sm){

                sm=current;

            }

           
        }


        return fm+sm+cost;

        
    }
}