# 3740. Minimum Distance Between Three Equal Elements I
# https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i/

class Solution {
    public int minimumDistance(int[] nums) {


        if(nums.length<3){
            return -1;
        }


        int good =Integer.MAX_VALUE;

        for(int i=0 ;i<nums.length-2 ;i++){

            int curr=0;

            for(int j=i+1;j<nums.length-1 ;j++){

                for(int k=j+1;k<nums.length ;k++){

                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        curr= Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);

                        good = Math.min(good,curr);


                    }


            
        }
            
        }

        }


        if(good== Integer.MAX_VALUE){
            return -1;
        }

        return good;
        
    }
}