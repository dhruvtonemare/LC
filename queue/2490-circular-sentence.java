# 2490. Circular Sentence
# https://leetcode.com/problems/circular-sentence/

class Solution {
    public boolean isCircularSentence(String sentence) {


        if(sentence.length() ==1){

            return true;
        }

        if(sentence.charAt(sentence.length()-1) == sentence.charAt(0)){


            for(int i=0 ; i<sentence.length() ; i++){

                if(i==sentence.length()-1 
                
                ){
                    return true;
                }

                else if(sentence.charAt(i+1) == ' ' 
                &&
             Character.toLowerCase(sentence.charAt(i))  != Character.toLowerCase(sentence.charAt(i+2))   ){
                return false;
              }

                
            }




        }

    
        return false;
    }
}