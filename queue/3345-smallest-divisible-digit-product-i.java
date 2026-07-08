# 3345. Smallest Divisible Digit Product I
# https://leetcode.com/problems/smallest-divisible-digit-product-i/

class Solution {
    public int smallestNumber(int n, int t) {

        for(int i=n ; i<Integer.MAX_VALUE; i++){

            int curr =i;
            int res=1;
            while(curr>0){

               

                res*=curr%10;

                if(res==0){
                    return i;
                }
                curr/=10;

            }

            if(res%t ==0){
                return i;
            }
        }

        return -1;
        
    }
}