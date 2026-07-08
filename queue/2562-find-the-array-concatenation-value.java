# 2562. Find the Array Concatenation Value
# https://leetcode.com/problems/find-the-array-concatenation-value/

class Solution {
    public long findTheArrayConcVal(int[] nums) {

       int n= nums.length;

       if(n==1)return nums[0];

       int l=0;
       int h=n-1;
       long result=0;
       
       while(l<h){
        
        String x= String.valueOf(nums[l])+String.valueOf(nums[h]);
        result+=Integer.parseInt(x);

        l++;
        h--;
       }

       if(n%2!=0){
        result+=nums[l];
       }
        
        return result;
    }
}