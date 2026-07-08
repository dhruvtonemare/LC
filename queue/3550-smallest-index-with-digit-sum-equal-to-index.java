# 3550. Smallest Index With Digit Sum Equal to Index
# https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/

class Solution {
    public int smallestIndex(int[] nums) {


        for(int i=0 ; i<nums.length ; i++){

            

            

            int score =0;
            int x = nums[i];

            while(x>0){
                int d = x%10;
                score+=d;
                x/=10;
            }

            if(score==i){
                System.out.println(score);
               return  i;
            }
            
        }

        return -1;
        
    }
}