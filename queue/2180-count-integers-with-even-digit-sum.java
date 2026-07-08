# 2180. Count Integers With Even Digit Sum
# https://leetcode.com/problems/count-integers-with-even-digit-sum/

class Solution {
    public int countEven(int num) {

        int count =0;


        for(int i=2 ; i<=num ; i++){
            int curr=i;
            int cs =0;

            while(curr>0){
                cs+=curr%10;
                curr/=10;
            }

            if(cs%2==0){
                count++;
            }

        }


        return count;

      
        
    }
}