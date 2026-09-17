# 414. Third Maximum Number
# https://leetcode.com/problems/third-maximum-number/

class Solution {
    public int thirdMax(int[] nums) {


        Integer f = null;
        Integer s = null;
        Integer t = null;

        for(int i=0 ; i <nums.length; i++){

            int current = nums[i];

                       if ((f != null && current == f) ||
    (s != null && current == s) ||
    (t != null && current == t)) {
    continue;
}


            if(f == null ||current>f){

                t=s;
                s=f;
                f=current;
            }

            else if(s == null ||current > s){
                t=s;
                s=current;
            }

           else if(t== null || current >t){
            t=current;
           }
        
        }

        if(t==null){
            return f;
        }
        return t;
        
    }
}