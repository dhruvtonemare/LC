# 645. Set Mismatch
# https://leetcode.com/problems/set-mismatch/

class Solution {
    public int[] findErrorNums(int[] nums) {

        int error =0;
        
        int [] result= new int[2];

        int n= nums.length;
        
        int total = (n*(n+1))/2;

        Set<Integer>s =new HashSet<>();
        int current=0;

        for(int i =0 ; i<n ; i++){

            current+=nums[i];

          

            if(s.contains(nums[i])){

                error= nums[i];
                result[0]=nums[i];

                
            }
            s.add(nums[i]);

            
        }


        current-=error;

        total-=current;

        result[1]=total;

      

        return result;
        
    }
}