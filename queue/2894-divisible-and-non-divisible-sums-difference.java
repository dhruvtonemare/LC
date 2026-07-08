# 2894. Divisible and Non-divisible Sums Difference
# https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/

class Solution {
    public int differenceOfSums(int n, int m) {

        int d=0;
        int nd=0;

        for(int i=1 ; i<=n ; i++){
            if(i%m ==0){
                d+=i;
            }
            else{
                nd+=i;
            }
        }

        return nd-d;
        
    }
}