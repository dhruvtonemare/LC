# 2441. Largest Positive Integer That Exists With Its Negative
# https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/

class Solution {
    public int findMaxK(int[] nums) {

        if(nums.length ==1 ){
            return -1;
        }


        Set<Integer>s = new HashSet<>();


        int max =-1;


        for(int i=0 ; i< nums.length  ; i++){

            int curr = nums[i];

            s.add(curr);

            if(curr<0 && s.contains(curr*(-1))  &&  (curr*(-1)) > max ){

                max =  (curr*(-1));
            }


            else if(curr>max && s.contains(0-curr)){
                max=curr;
            }
        }


        return max;
        
    }
}