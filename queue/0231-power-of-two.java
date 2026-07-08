# 231. Power of Two
# https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n == 1 ){
            return true;
        }
        else if(n % 2 !=0){
            return false;
        }

       for(int i =0 ;i<= 2000; i++){

        int current =  (int)Math.pow(2,i);

        if(current ==  n){
            return true ;
        }
        if(current > n){
            return false;
        }
        


       }

       return false ;
        
    }
}