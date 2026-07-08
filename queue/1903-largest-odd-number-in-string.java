# 1903. Largest Odd Number in String
# https://leetcode.com/problems/largest-odd-number-in-string/

class Solution {
    public String largestOddNumber(String num) {

        StringBuilder sb = new StringBuilder("");

        int pos=-1;

        for(int i = num.length()-1 ; i>=0 ; i--){

            if(Character.getNumericValue(num.charAt(i))  %2 !=0){
             
             pos=i;
             break;

            }
        }

        if(pos==-1){
            return "";
        }

        for(int i=0 ; i<=pos ; i++){

            sb.append(num.charAt(i));
        }


        return sb.toString();


        
    }
}  