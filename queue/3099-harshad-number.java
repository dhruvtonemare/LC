# 3099. Harshad Number
# https://leetcode.com/problems/harshad-number/

class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {

        


        int n=x;
        int sum=0;
        
       
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }

        if(x%sum == 0){
            return sum;
        }

        return -1;
        
    }
}