# 2427. Number of Common Factors
# https://leetcode.com/problems/number-of-common-factors/

class Solution {
    public int commonFactors(int a, int b) {



        int x=0;


        if(a>=b){
            x=a;
        }
        else{
            x=b;
        }

        int count=0;

        for(int i=1; i<=x; i++){

            if((a%i==0) && (b%i==0)){

                count ++;
            }

            
        }

        return count;
        
    }
}