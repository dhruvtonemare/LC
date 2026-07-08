# 342. Power of Four
# https://leetcode.com/problems/power-of-four/

class Solution {
    public boolean isPowerOfFour(int n) {

        if(n==1){
            return true;
        }
        else if(n%2!=0){
            return false ;
        }
       
        for( int i =1;i<=15;i++){
            if((int)Math.pow(4,i)== n){

              return true;

            }
        }

          return false;
        
    }
}