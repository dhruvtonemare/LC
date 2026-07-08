# 1437. Check If All 1's Are at Least Length K Places Away
# https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/

class Solution {
    public boolean kLengthApart(int[] nums, int k) {

        if(nums.length ==1 ){
            return true;
        }

       int f=-1;

       int fi = 0;

       

        for(int i=0 ; i<nums.length ;i++){

            if(nums[i]==1 && fi ==1 ){

                if(Math.abs(i-f-1)<k){

                    System.out.println(f);

                    System.out.println(i);

                    return false;

                }

                f=i;

            }

            else if(nums[i]==1 && fi == 0){
                fi=1;
                f=i;
            }



            


        }


        return true;
        
    }
}