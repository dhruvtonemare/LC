# 2000. Reverse Prefix of Word
# https://leetcode.com/problems/reverse-prefix-of-word/

class Solution {
    public String reversePrefix(String word, char ch) {

        StringBuilder sb= new StringBuilder("");

        boolean f= false;

        int pos=0;
        for(int i=0 ; i<word.length() ; i++){
            
            char curr =word.charAt(i);
           
            if(f){
               sb.append(curr); 
            }
            else{
                sb.insert(0,curr);
                
                if(curr==ch){
                    f=true;
                }
                
            }
        }


        if(f){

            
            return sb.toString();
           
        }

        return word;




        
    }
}