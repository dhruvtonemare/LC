# 2595. Number of Even and Odd Bits
# https://leetcode.com/problems/number-of-even-and-odd-bits/

class Solution {
    public int[] evenOddBit(int n) {

        int even =0 ; 
        int odd =0;
        

        int i=0;

        while(n>0){

            if(n%2==1  && i%2==0){
                even++;
            }
            else if(n%2==1  && i%2!=0){
                odd++;
            }
           
           i++;
           n/=2;
            

        }


        int [] result = new int[2];

        result[0]=even ; 
        result[1]=odd;

        return result;
    }
}