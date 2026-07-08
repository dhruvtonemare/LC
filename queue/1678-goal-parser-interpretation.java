# 1678. Goal Parser Interpretation
# https://leetcode.com/problems/goal-parser-interpretation/

class Solution {
    public String interpret(String command) {

        StringBuilder sb = new StringBuilder("");

        Stack<Character>s = new Stack<>();

        for(int i=0 ;i<command.length(); i++){

            char ch = command.charAt(i);

            if( ch == 'G'){
                s.push(ch);
                sb.append('G');
            }

            else if(ch==')'  && s.peek()=='l'){
                s.push(ch);
                 sb.append("al");

            }

            else if(ch==')'  && s.peek()=='('){
                s.push(ch);
                 sb.append('o');

            }

            else{
                s.push(ch);
            }


        }

        return sb.toString();
        
    }
}