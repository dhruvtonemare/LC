# 326. Power of Three
# https://leetcode.com/problems/power-of-three/

class Solution {
    public boolean isPowerOfThree(int n) {


        if(n ==1){
            return true;
        }

        long i = 3;

        while(i < Integer.MAX_VALUE){

            if(i == n  ){
                return true;
            }

            else if(i>n){
                break;
            }


            i*=3;
        }

        return false;
        
    }
}