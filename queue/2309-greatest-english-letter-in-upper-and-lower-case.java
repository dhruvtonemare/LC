# 2309. Greatest English Letter in Upper and Lower Case
# https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/

class Solution {
    public String greatestLetter(String s) {

        int n= s.length();

        if(n==1){
            return "";
        }

     Set<Character>hs = new HashSet<>();

     StringBuilder sb = new StringBuilder("");

     char x= '.';

     for(int i=0 ; i <n ; i++){
       
       char ch = s.charAt(i);
       hs.add(ch);

       if((hs.contains(Character.toLowerCase(ch)) &&  hs.contains(Character.toUpperCase(ch)))  && 
       Character.toUpperCase(ch)> Character.toUpperCase(x)   ){
            
            x=Character.toUpperCase(ch);
           

            
        }

       

     }


     if(x=='.'){
        return "";
     }

     sb.append(Character.toUpperCase(x));

     return sb.toString();
        
    }
}