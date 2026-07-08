# 2520. Count the Digits That Divide a Number
# https://leetcode.com/problems/count-the-digits-that-divide-a-number/

class Solution {
    public int countDigits(int num) {

        int x=num;

        int ans=0;

        while(x>0){

            int d=x%10;

            if(num%d==0){
                ans++;
            }

            x/=10;
        }

        return ans;
        
    }
}