# 3684. Maximize Sum of At Most K Distinct Elements
# https://leetcode.com/problems/maximize-sum-of-at-most-k-distinct-elements/

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {

        Arrays.sort(nums);

        Set<Integer>s = new HashSet<>();

     int    i=nums.length-1;

        int sc=0;

        ArrayList<Integer>a =new ArrayList<>();



        while( i>=0 && k>=1){


            if(!s.contains(nums[i])){

                sc+=nums[i];
                
                k--;

                s.add(nums[i]);
                a.add(nums[i]);

            }

         i--;


        }


return a.stream().mapToInt(Integer::intValue).toArray();


        

        
    }
}