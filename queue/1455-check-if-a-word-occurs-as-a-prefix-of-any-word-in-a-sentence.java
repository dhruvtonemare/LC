# 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
# https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

     String[] words = sentence.split(" ");


     for(int i =0 ; i<words.length; i++){
        String x = words[i];

        if(x.length()>=searchWord.length()){

            int m=0;
            int n=0;

            while(m<x.length() && n<searchWord.length()){

                if(x.charAt(m)!=searchWord.charAt(n)){
                    break;
                }

                else if(n==searchWord.length()-1  && x.charAt(m)==searchWord.charAt(n)){
                    return i+1;
                }
                m++;n++;
            }


        }
     }


        return -1;
        
    }
}