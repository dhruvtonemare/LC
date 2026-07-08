# 3745. Maximize Expression of Three Elements
# https://leetcode.com/problems/maximize-expression-of-three-elements/

class Solution {
    public int maximizeExpressionOfThree(int[] nums) {

        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        int t = Integer.MAX_VALUE;

        for(int i=0 ; i<nums.length ; i++){

            int curr=nums[i];

            if(curr<t){
                t=curr;
            }

            if(curr>f){
                s=f;
                f=curr;
            }

            else if(curr>s){
                s=curr;
            }


        }

        System.out.println(f);
        System.out.println(s);
        System.out.println(t);

        return f+s-t;
        
    }
}