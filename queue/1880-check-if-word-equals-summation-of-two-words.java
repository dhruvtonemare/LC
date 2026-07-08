# 1880. Check if Word Equals Summation of Two Words
# https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        int fw=0;

        for(int i=0; i<firstWord.length(); i++){
            int pos=firstWord.charAt(i)-'a';

            fw=(fw*10)+pos;
        }

        int sw=0;

        for(int i=0; i<secondWord.length(); i++){
            int pos=secondWord.charAt(i)-'a';

            sw=(sw*10)+pos;
        }

        int tw=0;

        for(int i=0; i<targetWord.length(); i++){
            int pos=targetWord.charAt(i)-'a';

            tw=(tw*10)+pos;
        }


        return ((fw+sw)==tw);
        
    }
}