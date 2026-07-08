# 747. Largest Number At Least Twice of Others
# https://leetcode.com/problems/largest-number-at-least-twice-of-others/

class Solution {
    public int dominantIndex(int[] nums) {

        int max = Integer.MIN_VALUE;

        int index =0;


        for(int i=0 ; i< nums.length ; i++){

            if(nums[i]>max){
                max = nums[i];

                index=i;
            }
        }

        for(int i=0 ; i< nums.length ; i++){

            if(i!=index){

                if(nums[i]*2  >max){
                    return -1;
                }
            }

           
        }


        return index;

        
        
    }
}