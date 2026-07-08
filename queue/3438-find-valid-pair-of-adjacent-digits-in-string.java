# 3438. Find Valid Pair of Adjacent Digits in String
# https://leetcode.com/problems/find-valid-pair-of-adjacent-digits-in-string/

class Solution {
    public String findValidPair(String s) {

        HashMap<Character,Integer>hm = new HashMap<>();

        for(int i=0 ; i<s.length(); i++){
            
            char ch= s.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);

            }
            else{
                  hm.put(ch, 1);
            }
        }

        StringBuilder sb = new StringBuilder("");


       for(int i=1 ; i<s.length(); i++){
            
            char ch = s.charAt(i);
            int n= Character.getNumericValue(ch);
            int l= Character.getNumericValue(s.charAt(i-1));
            if(ch!=s.charAt(i-1) && n== hm.get(ch) &&  l== hm.get(s.charAt(i-1))){
                sb.append(s.charAt(i-1));
                sb.append(ch);
                 return sb.toString();
                 }
        }

        return sb.toString();

        
    }
}