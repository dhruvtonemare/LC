# 3637. Trionic Array I
# https://leetcode.com/problems/trionic-array-i/

class Solution {
    public boolean isTrionic(int[] nums) {


        int p=0;


        

        int n=nums.length;

        if(nums.length-1<nums.length-2    ){
            return false;
        }

         if(        nums[0]>nums[1]   ){
            return false;
        }


        int phase =0;
        int inc,dec;
        inc=dec=0;


        for(int i=1; i<n ; i++){

             if (nums[i] == nums[i - 1]) return false;


             if(phase==0){
                if(nums[i]<nums[i-1]){
                    inc++;
                    phase=1;
                    
                }
             }

            else  if(phase==1){
                if(nums[i]>nums[i-1]){
                    dec++;
                    phase=2;
                    
                }
             }

             else{

                if(nums[i]<nums[i-1]){
                    return false;
                }
             }

             
             

            

        }





        


 if(phase==2)inc++;

             return inc==2 && dec==1;

        
        
    }
}