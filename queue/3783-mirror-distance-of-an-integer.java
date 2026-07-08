# 3783. Mirror Distance of an Integer
# https://leetcode.com/problems/mirror-distance-of-an-integer/

class Solution {
    public int mirrorDistance(int n) {

        if(n<9){
            return 0;
        }

        else{
            int x = n;

            int m=0;

            int place=0;

            

            while(x>0){
             
                 int digit=x%10;

                 m=(m*10)+digit;

                x/=10;
             
               
               
            }
           
           return Math.abs(n-m);

        }
        
    }
}