# 905. Sort Array By Parity
# https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    public int[] sortArrayByParity(int[] nums) {


        int [] res= new int[nums.length ];

        int pos=0 ;

        for(int i=0 ; i<nums.length ; i++){

            if(nums[i]%2==0){
                res[pos]=nums[i];
                pos++;
            }
        }
          for(int i=0 ; i<nums.length ; i++){

            if(nums[i]%2!=0){
                res[pos]=nums[i];
                pos++;
            }
        }


        return res;
        
    }
}