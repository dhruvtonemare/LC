# 724. Find Pivot Index
# https://leetcode.com/problems/find-pivot-index/

class Solution {
    public int pivotIndex(int[] nums) {


        int n= nums.length;

        if(n==1){
            return 0;
        }

        

        int total=0;

        //calculate the total first

        for(int i=0; i<n ; i++){

            total+=nums[i];
        } 

        int i=0;

        int sum_left=0;
        int sum_right=0;

        while(i<n){

            int current=nums[i];

            sum_right=total-sum_left-current;

            


            if(i==0){
                sum_left=0;
                sum_right=total-nums[0];


                if(sum_left== sum_right){
                    return i;
                }

                
                


            }


           if(i==n-1){
                sum_right=0;
                sum_left=total-nums[n-1];


                if(sum_left== sum_right){
                    return i;
                }
                else{
                    return -1;
                }


            }

            if(sum_left==sum_right){
                return i;
            }

            sum_left+=current;
            

            i++;
        }
            

            return -1;

        
    }
}