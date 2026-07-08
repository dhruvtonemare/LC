# 205. Isomorphic Strings
# https://leetcode.com/problems/isomorphic-strings/

class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length()!= t.length()){
            return false;
        }


        HashMap<Character,Character>hm = new HashMap<>();


        for(int i=0 ; i<s.length() ; i++){

            char ch = s.charAt(i);

             if(hm.containsKey(ch)){

                if(hm.get(ch) != t.charAt(i)){
                    return false;
                }
             }
            else{

                 if(hm.containsValue(t.charAt(i))){
                    return false;
                }

                hm.put(ch, t.charAt(i));


                
            }
        }

         return true;
        
    }
}