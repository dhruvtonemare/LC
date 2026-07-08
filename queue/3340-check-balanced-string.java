# 3340. Check Balanced String
# https://leetcode.com/problems/check-balanced-string/

class Solution {
    public boolean isBalanced(String num) {

        int even , odd;

        even = odd=0;

        for(int i=0 ; i<num.length(); i++){

            int curr =num.charAt(i)-'0';

            if(i%2 ==0){
                even+=curr;
            }
            else{
                odd+=curr;
            }
        }

        return even == odd;
        
    }
}