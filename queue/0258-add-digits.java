# 258. Add Digits
# https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {

        int sum=0 ;

        while(num>9){

            while(num!=0){
             sum+= num%10;
             num/=10;
             }

             num=sum;
             sum=0;
        }
      return num;  
    }
}