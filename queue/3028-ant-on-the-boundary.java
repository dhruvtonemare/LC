# 3028. Ant on the Boundary
# https://leetcode.com/problems/ant-on-the-boundary/

class Solution {
    public int returnToBoundaryCount(int[] nums) {


        int curr= 0; 

        int b=0;

        for(int i=0 ; i<nums.length ; i++){
            curr+= nums[i];

            if(curr==0){

                b++;

            }
        }

        return b;
        
    }
}