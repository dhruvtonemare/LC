# 2390. Removing Stars From a String
# https://leetcode.com/problems/removing-stars-from-a-string/

class Solution {
    public String removeStars(String s) {

        StringBuilder sb = new StringBuilder("");

        Stack<Character>ss = new Stack<>();

        for(int i=0 ; i<s.length() ; i++){
            
            char ch = s.charAt(i);

            if(ch == '*'){
                ss.pop();
            }
            else{
                ss.push(ch);
            }
        }

        while(!ss.isEmpty()){
            sb.insert(0,ss.pop());
        }

        return sb.toString();
        
    }
}