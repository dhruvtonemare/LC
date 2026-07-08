# 2544. Alternating Digit Sum
# https://leetcode.com/problems/alternating-digit-sum/

class Solution {
    public int alternateDigitSum(int n) {

        int result=0;


        String s = String.valueOf(n);

        boolean plus = false;

        if(s.length() % 2 !=0){

            plus=true;
            
        }

        while(n>0){

            int digit = n%10;

            n/=10;
            if(plus){
                result+=digit;
                plus=false;
            }
            else{
                int a = 0-digit;
                result+=a;
                plus=true;
            }

        }

           return result;
             
    }
}