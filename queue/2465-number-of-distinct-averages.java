# 2465. Number of Distinct Averages
# https://leetcode.com/problems/number-of-distinct-averages/

class Solution {
    public int distinctAverages(int[] nums) {

        if(nums.length==2){
            return 1;
        }

        Arrays.sort(nums);

        Set<Integer>s=new HashSet<>();

        int l=0;
        int r=nums.length-1;

        while(l<r){


          int avg= nums[l]+nums[r];

          s.add(avg);

          l++;
          r--;

            
        }

        return s.size();



        
    }
}