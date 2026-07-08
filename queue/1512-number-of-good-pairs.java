# 1512. Number of Good Pairs
# https://leetcode.com/problems/number-of-good-pairs/

class Solution {
    public int numIdenticalPairs(int[] nums) {

        int count=0;

        int n=nums.length;

        Arrays.sort(nums);


        int i=0;

        int continuous=1;


        while(i<n-1){

            while(i<n-1 && nums[i]==nums[i+1]){

                count+=continuous;
                continuous+=1;

                i++;

            }

        

           continuous=1;

           i++;





        }



        return count ;
        
    }
}