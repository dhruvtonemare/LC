# 1005. Maximize Sum Of Array After K Negations
# https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/

class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        Arrays.sort(nums);

        int n= nums.length;
        int i=0;

        while(k>=1 && i<n &&nums[i] < 0){

            nums[i]*=-1;

            i++;
            k--;

        }

        if(k>0){


            Arrays.sort(nums);

            if(k%2==1){
                nums[0]*=-1;
            }
        }

        int sum=0;

        for(int j=0; j<n ; j++){
            int current=nums[j];

            sum+=current;
        }

        return sum;


        


        
    }
}