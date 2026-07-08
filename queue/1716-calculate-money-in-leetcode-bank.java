# 1716. Calculate Money in Leetcode Bank
# https://leetcode.com/problems/calculate-money-in-leetcode-bank/

class Solution {
    public int totalMoney(int n) {


        if(n<=7){


            return (n*(n+1))/2;
        }


        int ini=1;

        int inc =1;

        int money=0;


        for(int i=1 ; i<=n ; i++){

            

            if(i!=1 && i%7 ==0){

                money+=inc;
                System.out.println(inc);

                ini+=1;
                inc=ini;
                

                continue;


            }

            System.out.println(inc);

            money+=inc;
            inc++;

        }


        return money;
    }
}