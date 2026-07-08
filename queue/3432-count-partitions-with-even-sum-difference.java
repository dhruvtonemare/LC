# 3432. Count Partitions with Even Sum Difference
# https://leetcode.com/problems/count-partitions-with-even-sum-difference/

class Solution {
    public int countPartitions(int[] nums) {


        int curr=0;

        int sum =0 ; 

        for(int i=0 ; i<nums.length ; i++){

            sum+= nums[i];


        }

        int cp =0; 


        for(int i=0 ; i<nums.length-1 ; i++){

            curr+=nums[i];

            if((curr-(sum-curr) )  % 2 ==0){

                cp++;
            }

            


        }


        return cp;








        
    }
}