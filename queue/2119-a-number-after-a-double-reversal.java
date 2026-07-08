# 2119. A Number After a Double Reversal
# https://leetcode.com/problems/a-number-after-a-double-reversal/

class Solution {
    public boolean isSameAfterReversals(int num) {

        int x = 0;

        int n = num;

        while(n>0){
            int d=n%10;

            x=(x*10)+d;
            n/=10;
        }

        int m=0;

        System.out.println(x);

        while(x>0){
            int d=x%10;

            m=(m*10)+d;
            System.out.println(m);
            x/=10;
        }

        System.out.println(m);

       return m==num;


        
        
    }
}