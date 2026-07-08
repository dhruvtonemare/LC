# 1680. Concatenation of Consecutive Binary Numbers
# https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/

class Solution {
    public int concatenatedBinary(int n) {

        if(n==1 ){
            return 1;
        }

        StringBuilder sb = new StringBuilder("");

        for(int i =1 ;i<=n ;i++){

            sb.append(Integer.toBinaryString(i));
        }

        long result = 0;
        int mod = 1_000_000_007;

        
        
        for(int i = 0; i<sb.length() ; i++ ){
            

            

                result= (result*2+ (sb.charAt(i) - '0'))%mod;
                
            
           
        }


        return (int)result;

        
        
    }
}