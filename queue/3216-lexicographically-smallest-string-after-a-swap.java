# 3216. Lexicographically Smallest String After a Swap
# https://leetcode.com/problems/lexicographically-smallest-string-after-a-swap/

class Solution {
    public String getSmallestString(String s) {

        int i=0 ; 
        int j=i+1;

        StringBuilder sb = new StringBuilder(s);

        while(i<s.length()-1 && j<s.length()){


            int x=Character.getNumericValue(s.charAt(i));
            int y=Character.getNumericValue(s.charAt(j));

            if(x>y  && x%2 ==0 &&  y%2 == 0){
                char ch = sb.charAt(i);
                sb.setCharAt(i,s.charAt(j));
                 sb.setCharAt(j,ch);

                       return sb.toString();


            }

           else  if(x>y  && x%2 !=0 &&  y%2 != 0){

                char ch = sb.charAt(i);
                sb.setCharAt(i,s.charAt(j));
                 sb.setCharAt(j,ch);


                      return sb.toString();

            }

            i++;
            j++;
        }


        return sb.toString();
        
    }
}