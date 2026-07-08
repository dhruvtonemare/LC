# 3370. Smallest Number With All Set Bits
# https://leetcode.com/problems/smallest-number-with-all-set-bits/

class Solution {
    public int smallestNumber(int n) {

        for(int i=n ;i<Integer.MAX_VALUE; i++){

            String x = binary(i);

            if(all_one(x)){
                return i;
            }
            


        }

        return -1;
        
    }

    public String binary(int i){
        StringBuilder sb= new StringBuilder("");

        while(i>0){
            sb.append(i%2);
            i/=2;
        }

        return sb.toString();
    }
    public boolean all_one(String x){

        for(int i=0; i<x.length();i++){
            if(x.charAt(i)=='0'){
                return false;
            }
        }
        return true;
    }


}