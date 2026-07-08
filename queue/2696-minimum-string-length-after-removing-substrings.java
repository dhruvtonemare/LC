# 2696. Minimum String Length After Removing Substrings
# https://leetcode.com/problems/minimum-string-length-after-removing-substrings/

class Solution {
    public int minLength(String str) {

        if(1== str.length()){

            return 1;
        }


        Stack<Character>s = new Stack<>();

        for(int i=0 ; i<str.length(); i++){

            char ch = str.charAt(i);

            if(s.isEmpty()){
                s.push(ch);
            }

            else if(!s.isEmpty() && ch=='B' && s.peek()=='A'){

               
                    s.pop();
                
            }
           else if(!s.isEmpty() &&ch=='D' && s.peek()=='C'){

                
                    s.pop();
                
            }

         else{
            s.push(ch);
         }




        }

        

        return s.size();
        
    }
}