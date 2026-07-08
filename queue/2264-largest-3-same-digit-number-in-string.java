# 2264. Largest 3-Same-Digit Number in String
# https://leetcode.com/problems/largest-3-same-digit-number-in-string/

class Solution {
    public String largestGoodInteger(String num) {

        if(num.length() ==3 && num.charAt(0)!= num.charAt(num.length()-1)){
            return "";
        }

        int largest= Integer.MIN_VALUE;

    

        for(int i=0 ; i<=num.length()-3; i++){

            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2)){

                int x = Character.getNumericValue(num.charAt(i));

                largest= Math.max(x,largest);
            }
        }

        if(largest == Integer.MIN_VALUE){
            return "";
        }

        return String.valueOf(largest)+String.valueOf(largest)+String.valueOf(largest);
        
    }
}