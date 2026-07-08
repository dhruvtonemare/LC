# 2733. Neither Minimum nor Maximum
# https://leetcode.com/problems/neither-minimum-nor-maximum/

class Solution {
    public int findNonMinOrMax(int[] nums) {

        int n= nums.length;

        if(n==1 || n==2 ){
            return -1;
        }

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0 ; i<nums.length; i++){
            int curr= nums[i];
            if(curr>max){
                max=curr;
            }
             if(curr<min){
                min=curr;
            }
        }

        for(int i=0 ; i<nums.length; i++){
            int curr= nums[i];

            if(curr<max && curr>min){
                return curr;
            }
          
        }

        return -1;


        
    }
}