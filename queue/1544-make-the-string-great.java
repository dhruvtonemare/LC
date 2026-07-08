# 1544. Make The String Great
# https://leetcode.com/problems/make-the-string-great/

class Solution {
    public String makeGood(String s) {

        if(s.length() == 1 ){
            return s;
        }

        Stack <Character>st = new Stack<>();

        int i=s.length()-1 ;

        while(i>=0){

            char ch = s.charAt(i);

            if(st.isEmpty()){
                st.push(ch);
            }
            
            else if(ch!=st.peek() &&  Character.toLowerCase(ch) ==  Character.toLowerCase(st.peek()) ){

               st.pop();
            }

            else{
                st.push(ch);
            }
            i--;

        }


        if(st.isEmpty()){
            return "";
        }

        StringBuilder sb = new StringBuilder("");

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.toString();
        
    }
}