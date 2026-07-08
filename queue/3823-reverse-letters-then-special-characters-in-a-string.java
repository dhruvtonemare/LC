# 3823. Reverse Letters Then Special Characters in a String
# https://leetcode.com/problems/reverse-letters-then-special-characters-in-a-string/

class Solution {
    public String reverseByType(String s) {

        if(s.length()==1){
            return s;
        }

        StringBuilder sb= new StringBuilder(s);

        int l=0;
        int h=sb.length()-1;

        while(l<h){
            char c1=sb.charAt(l);
            char c2=sb.charAt(h);

            if((c1>='a' && c1 <='z') && (c2>='a' && c2 <='z') ){
                char temp=c1;
                sb.setCharAt(l,  sb.charAt(h));
                sb.setCharAt(h,  temp);
                l++; h--;
            }

            else if((c1>='a' && c1 <='z') && (c2<'a' || c2>'z' )){
                h--;
            }

             else if((c1<'a' || c1>'z') && (c2>='a' && c2 <='z' )){
                l++;
            }
            
            else{
                l++;
                h--;
            }
            

        }

          l=0;
         h=sb.length()-1;

         while(l<h){
            char c1=sb.charAt(l);
            char c2=sb.charAt(h);

            if((c1<'a' || c1 >'z') && (c2<'a' || c2 >'z') ){
                char temp=c1;
                sb.setCharAt(l,  sb.charAt(h));
                sb.setCharAt(h,  temp);
                l++; h--;
            }

            else if((c1<'a' || c1 >'z') && (c2>='a' && c2 <='z' )){
                h--;
            }

             else if((c1>='a' && c1 <='z') && (c2<'a' || c2 >'z')){
                l++;
            }
            
            else{
                l++;
                h--;
            }
            

        }

         

        return sb.toString();
        
    }
}