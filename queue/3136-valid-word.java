# 3136. Valid Word
# https://leetcode.com/problems/valid-word/

class Solution {
    public boolean isValid(String word) {

        int n= word.length();

        if(n<3){
            return false;
        }


        boolean vowel = false ;
        boolean upper = false ;
        boolean lower = false ;
        boolean num =  false;
        boolean consonant = false ;


        for(int i=0 ;i <n ; i++){

            char ch = word.charAt(i);

            if(ch == '@' || ch == '#' || ch == '$' ){
                return false;
            }
            
            if(ch>='a'&&  ch<='z'){
                lower = true;
                
            }

            if(ch>='A'&&  ch<='Z'){
                upper = true;
                
            }

            if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u' ||
             ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U' ){

                vowel = true;

             }

             if(Character.isDigit(ch)){
                num=true;
             }

             if(Character.isLetter(ch) &&
   ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
   ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' ){

                consonant = true;

             }

             



        }


        return  vowel&&consonant;


        


        
    }
}