# 3774. Absolute Difference Between Maximum and Minimum K Elements
# https://leetcode.com/problems/absolute-difference-between-maximum-and-minimum-k-elements/

class Solution {
    public int absDifference(int[] nums, int k) {

        Arrays.sort(nums);

        int f=k;

       int i=0; 

       int s=0;

       int l=0;



       while(k>=1  ){

        s+=nums[i];

        f--;
        i++;

        if(f==0){
            break;
        }
       }

      i  =nums.length-1;
        f=k;
        while(k>=1){

        l+=nums[i];

       k--;
        i--;
        if(k==0){
            break;
        }
       }

       System.out.println(s);
       System.out.println(l);

       return Math.abs(l-s);
        
    }
}