# 2351. First Letter to Appear Twice
# https://leetcode.com/problems/first-letter-to-appear-twice/

class Solution {
    public char repeatedCharacter(String s) {

        Set<Character>ss = new HashSet<>();

        for(int i=0 ; i<s.length(); i++){

            if(ss.contains(s.charAt(i))){
                return s.charAt(i);
            }

            ss.add(s.charAt(i));
        }

        return 'z';
        
    }
}