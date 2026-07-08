# 1913. Maximum Product Difference Between Two Pairs
# https://leetcode.com/problems/maximum-product-difference-between-two-pairs/

class Solution {
    public int maxProductDifference(int[] nums) {

        int f=Integer.MAX_VALUE;
        int s=Integer.MAX_VALUE;
        int t=Integer.MIN_VALUE;
        int fo=Integer.MIN_VALUE;


        for(int i=0 ; i<nums.length ; i++){

            int curr = nums[i];

            if(f>curr){
                s=f;
                f=curr;
            }
            else if(s>curr){
                s=curr;
            }

            if(fo<curr){
                t=fo;
                fo=curr;
            }
           else if(t<curr){
                t=curr;
            }

        }
        

        System.out.println(f);
        System.out.println(s);
        System.out.println(t);
        System.out.println(fo);

        return  (t*fo) - (f*s) ;

        
    }
}