# 693. Binary Number with Alternating Bits
# https://leetcode.com/problems/binary-number-with-alternating-bits/

class Solution {
    public boolean hasAlternatingBits(int n) {


        // convert the given n to the binary first 

        //check the last appended digit to the binary string is diffrnt or not if not then return     
        //true            else                false

        StringBuilder sb =new StringBuilder("");
        int i=0;

        while(n>0){

            if(i>0){

                sb.append(n%2);

                if(sb.charAt(sb.length()-1) == sb.charAt(sb.length()-2)){

                    return false;


                }
                n/=2;
                i++;
            }
            else{

                 sb.append(n%2);
                  n/=2;
                i++;

            }





            


        } 


        

         return true;
        
    }
}