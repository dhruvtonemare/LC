# 242. Valid Anagram
# https://leetcode.com/problems/valid-anagram/

class Solution {
    public boolean isAnagram(String s, String t) {


        if(s.length()!=t.length()){
            return false;
        }


        HashMap<Character, Integer> h = new HashMap<>();


        for(int i = 0 ; i<s.length(); i++){
           char ch = s.charAt(i);
           

           if(h.containsKey(ch)){
              
              h.put(ch,h.get(ch)+1);

           }
           else{
            h.put(ch,1);
           }

        }

        for(int i =0 ; i<t.length();i++){

                       char ch = t.charAt(i);

                       if(h.containsKey(ch)&&h.get(ch)==1){
                        h.remove(ch);
                       }

                       else if (h.containsKey(ch)){

                        h.put(ch,h.get(ch)-1);
                       }

                       else{
                        return false ;
                       }



        }


        return true;
    }
}