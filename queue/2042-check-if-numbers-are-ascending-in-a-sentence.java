# 2042. Check if Numbers Are Ascending in a Sentence
# https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/

class Solution {
    public boolean areNumbersAscending(String s) {

        int num=-1;

        String[] words = s.split(" ");



        for(int i=0 ; i<words.length; i++){

            if(words[i].matches("\\d+")){

                int current =Integer.parseInt(words[i]);

                if(current<=num){
                    return false;
                }

                num=current;


            }

           


        }


return true;
        
    }
}