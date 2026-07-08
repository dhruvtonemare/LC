# 2154. Keep Multiplying Found Values by Two
# https://leetcode.com/problems/keep-multiplying-found-values-by-two/

class Solution {
    public int findFinalValue(int[] nums, int orignal) {

        Set<Integer>s = new HashSet<>();

        for(int i=0 ; i<nums.length ; i++){

           

            s.add(nums[i]);


        }



         for(int i=0 ; i<nums.length ; i++){

            if(s.contains(orignal)){
                orignal*=2;
            }

           

        }

        return orignal;
        
    }
}