# 202. Happy Number
# https://leetcode.com/problems/happy-number/

class Solution {
    public boolean isHappy(int n) {



        Set<Integer>s = new HashSet<>();

        while(n!=1){
           
       if(s.contains(n)){return false;}
        else{
            s.add(n);
           n= addsquares(n);
            
        }

        }
        return true;
        
    }

    public int addsquares(int n){

        int num = n;

        int result =0;

        while(num>0){

            int digit=num%10;
            result+= (int) Math.pow(digit,2);
            num/=10;
        }

        return result;


    }



}