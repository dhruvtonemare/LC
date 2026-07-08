# 3120. Count the Number of Special Characters I
# https://leetcode.com/problems/count-the-number-of-special-characters-i/

class Solution {
    public int numberOfSpecialChars(String word) {
        

        int sc=0;

        Set<Character>s = new HashSet<>();
         Set<Character>m = new HashSet<>();

        for(int i=0 ; i<word.length() ; i++){

            char ch = word.charAt(i);

            if(m.contains(ch)){
                continue;
            }

            s.add(ch);

            if(s.contains(Character.toUpperCase(ch)) &&  s.contains(Character.toLowerCase(ch)) ){
                sc++;
                m.add(Character.toUpperCase(ch));
                m.add(Character.toLowerCase(ch));

                s.remove(Character.toUpperCase(ch));
                s.remove(Character.toLowerCase(ch));


            }
        }

        return sc;
    }
}