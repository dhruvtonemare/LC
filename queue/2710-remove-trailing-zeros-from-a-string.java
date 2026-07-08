# 2710. Remove Trailing Zeros From a String
# https://leetcode.com/problems/remove-trailing-zeros-from-a-string/

class Solution {
    public String removeTrailingZeros(String num) {

       

       int i=num.length()-1 ; 

       while(i>=0 && num.charAt(i)=='0'){


         i--;
       }

       if(i==0 &&num.charAt(i)=='0'){
          return "";
       }
       else if(i== num.length()-1){
        return num;
       }

       StringBuilder sb = new StringBuilder("");

       for(int j=0 ; j<=i ; j++){
        sb.append(num.charAt(j));
       }

       return sb.toString();
    }
}