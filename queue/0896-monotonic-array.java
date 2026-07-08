# 896. Monotonic Array
# https://leetcode.com/problems/monotonic-array/

class Solution {
    public boolean isMonotonic(int[] nums) {


        if(nums.length ==1 || nums.length ==2){

            return true;
        }

        boolean inc = false;


       for(int i=1 ; i<nums.length ;i++){

        if( i== nums.length-1 && nums[i]==nums[i-1]){

            return true;
            

        }

        if(nums[i]>nums[i-1]){

            inc=true;
            break;

        }

        else if(nums[i]<nums[i-1]){
            break;
        }


        else{
            continue;
        }





       }



       for(int i=1 ; i<nums.length ; i++){
        
        if(inc==false && nums[i] > nums[i-1]){
            return false;
        }

        if(inc && nums[i]<nums[i-1]){
            return false;
        }

        


       }





        return true;
    }
}