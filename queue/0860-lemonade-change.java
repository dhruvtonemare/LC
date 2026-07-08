# 860. Lemonade Change
# https://leetcode.com/problems/lemonade-change/

class Solution {
    public boolean lemonadeChange(int[] bills) {

        if(bills[0]>5){
            return false;
        }

        int five, ten,  twt;
        five=ten=twt=0;

        int balance=0;

        for(int i=0 ; i<bills.length;i++){
           
           if(bills[i]==5){
            five++;
            balance+=bills[i];
           }

         else if(bills[i]==10){
            if(five>=1){
                five--;
                ten++;
                balance+=bills[i];
            }
            else{
                return false;
            }
           }

            else if(bills[i]==20){
            if(five>=1 && ten>=1){
                five--;
                ten--;
                twt++;
                balance+=bills[i];
            }
            else if(five>=3){
                five-=3;
            }
            else{
                return false;
            }
           }


           
      }

      return true;

        

         
        
    }
}