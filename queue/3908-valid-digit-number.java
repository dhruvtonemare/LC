# 3908. Valid Digit Number
# https://leetcode.com/problems/valid-digit-number/

class Solution {
    public boolean validDigit(int n, int x) {

        int count=0;

        if(n==x){
            return false;
        }




        while(n>0){
            if(n<=9  && n == x){

                return false;

            }

            int d = n%10;

            if(d==x){
                count++;
            }

            n/=10;
        }

        if(count>=1){
            return true;
        }
        return false;


        
    }
}