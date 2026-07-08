# 1935. Maximum Number of Words You Can Type
# https://leetcode.com/problems/maximum-number-of-words-you-can-type/

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

         Set<Character>s=new HashSet<>();

        for(int i=0 ; i<brokenLetters.length(); i++){
            s.add(brokenLetters.charAt(i));
        }

        int be=0;

        for(int i=0 ; i<text.length(); i++){

            char ch=text.charAt(i);

           if(s.contains(ch)){
            
            while(i<text.length()-1 && text.charAt(i)!=' '){
                i++;
            }
           }

           else if(i==text.length()-1 && !s.contains(ch)){
            be++;
           }

           else if(text.charAt(i+1)==' ' &&  !s.contains(ch) ){
            be++;
           }


        }

        return be;

        
    }
}