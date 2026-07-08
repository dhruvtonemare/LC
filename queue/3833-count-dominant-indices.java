# 3833. Count Dominant Indices
# https://leetcode.com/problems/count-dominant-indices/

class Solution {
    public int dominantIndices(int[] nums) {

        int [] avg  = new int [nums.length];
        
        
        int curr=0;
        
        for(int i= nums.length -1 ; i>=0 ; i--){

            curr+=nums[i];

            avg[i]=curr/(nums.length-i);

        }

        int total =0;

        for(int i=0 ; i<nums.length -1 ; i++){
            if(nums[i]>avg[i+1]){
                System.out.println(avg[i+1]);
                
                total ++;
            }
        }

        return total;
        
    }
}