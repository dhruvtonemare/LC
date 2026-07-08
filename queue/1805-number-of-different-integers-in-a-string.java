# 1805. Number of Different Integers in a String
# https://leetcode.com/problems/number-of-different-integers-in-a-string/

class Solution {
    public int numDifferentIntegers(String word) {


        Set<String>s = new HashSet<>();

        for(int i =0 ; i<word.length () ; i++){

            char ch = word.charAt(i);

            if(Character.isDigit(ch)){

              while (i < word.length() && word.charAt(i) == '0') {
                    i++;
                }

                
                StringBuilder sb = new StringBuilder();


                while(i<word.length() && Character.isDigit(word.charAt(i))){
                    sb.append(word.charAt(i));
                    i++;
                }
                System.out.println(sb);
                s.add(sb.toString());
            }
        }


        return s.size();
        
    }
}