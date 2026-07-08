# 804. Unique Morse Code Words
# https://leetcode.com/problems/unique-morse-code-words/

class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
        "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        

        Set<String>s = new HashSet<>();

        for(int i=0 ; i<words.length ; i++){
            String x= words[i];
            StringBuilder sb = new StringBuilder("");

            for(int j=0 ; j<x.length(); j++){
                
                sb.append(morse[x.charAt(j)-'a']);
            }

            s.add(sb.toString());


        }



          return s.size();
        
        
    }
}