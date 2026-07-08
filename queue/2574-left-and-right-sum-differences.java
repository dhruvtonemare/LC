# 2574. Left and Right Sum Differences
# https://leetcode.com/problems/left-and-right-sum-differences/

class Solution {
    public int[] leftRightDifference(int[] nums) {


        int n= nums.length ;

        if(n==1){
            int [] res = new int [1];
            res[0]=0;


            return res;
        }



        int [] prefix = new int [nums.length];
        int [] suffix = new int [nums.length];



        prefix[0]=0;
        suffix[nums.length-1]=0;

        for(int i=1 ; i<n ; i++ ){

            prefix[i]= prefix[i-1]+nums[i-1];


        }


                for(int i=nums.length-2 ; i>=0 ; i-- ){

            suffix[i]= suffix[i+1]+nums[i+1];


        }


        int [] res = new int [nums.length];


        for(int i=0 ; i<nums.length ; i++){

            res[i]=Math.abs(prefix[i]-suffix[i]);
        }  


        return res;      
        
    }
}