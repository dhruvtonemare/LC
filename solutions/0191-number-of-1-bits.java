# 191. Number of 1 Bits
# https://leetcode.com/problems/number-of-1-bits/

class Solution {
    public int hammingWeight(int n) {


        int set_bit=0;

        int bit=0;

        while(n>0){
             bit = n%2;

            if(bit==1){
                set_bit++;
            }
            n/=2;
        }



          return set_bit;
        
    }


    
}