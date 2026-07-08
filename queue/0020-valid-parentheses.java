# 20. Valid Parentheses
# https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String s) {

        Stack <Character> sc = new Stack<>();

        for(int i =0 ; i<s.length();i++){
          
          char ch = s.charAt(i);
          

          if(ch == '['||ch == '('||ch == '{'){
            sc.push(ch);
          }
          else{
            
            if(sc.isEmpty()) return false;
            char top = sc.peek();

            if(ch== '}' && top == '{' ||
                    ch== ']' && top == '[' ||
                    ch== ')' && top == '('  ){

                        sc.pop();
                    }
                    else{
                        return false;
                    }
          }

        }
               return sc.isEmpty();


        
    }
}