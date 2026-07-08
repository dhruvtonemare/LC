# 2283. Check if Number Has Equal Digit Count and Digit Value
# https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/

class Solution {
    public boolean digitCount(String num) {


        HashMap<Character,Integer>hm = new HashMap<>();

        for(int i=0; i<num.length() ; i++){

        char ch = num.charAt(i);

         if(hm.containsKey(ch)){
            hm.put(ch,hm.get(ch)+1);        
             }

             else{
                hm.put(ch,1);
             }

        }


         for(int i=0 ; i<num.length() ; i++){

          

          char c = (char)(i + '0');

          

          if(hm.getOrDefault(c,0)!=Character.getNumericValue(num.charAt(i))){
            System.out.println(i);
            return false;
          }

           

        }


        return true;


        
    }
}