# 1832. Check if the Sentence Is Pangram
# https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class Solution {
    public boolean checkIfPangram(String sentence) {

        Set<Character>hs = new HashSet<>();

        for(int i=0 ; i<sentence.length(); i++){
           

            hs.add(sentence.charAt(i));
        }

        for(char i='a' ; i<='z'; i++){
           

           if(!hs.contains(i)){
            return false;
           }
        }


        return true;
    }
}