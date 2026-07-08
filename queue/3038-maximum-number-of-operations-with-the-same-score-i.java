# 3038. Maximum Number of Operations With the Same Score I
# https://leetcode.com/problems/maximum-number-of-operations-with-the-same-score-i/

class Solution {
    public int maxOperations(int[] nums) {

        if(nums.length ==2 ){
            return 1;
        }

        int i =0 ; 
        int j = i+1;

        int score=0;
        int ms=0;

        while(j<nums.length){

            int curr=nums[i]+nums[j]; 

            if(i==0){

                score=curr; 
                ms++;

            }

            else if(curr==score){

               ms++;

            }

            else{
                break;
            }

            

            i+=2;j+=2;

            
        }

        return ms;
        
    }
}