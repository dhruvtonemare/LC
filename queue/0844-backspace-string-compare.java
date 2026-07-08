# 844. Backspace String Compare
# https://leetcode.com/problems/backspace-string-compare/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        

        StringBuilder sb1= new StringBuilder("");
        StringBuilder sb2= new StringBuilder("");

        for(int i=0 ; i<s.length() ; i++){
            if(i==0  &&  s.charAt(i)!='#'){
                sb1.append(s.charAt(i));
            }
            else if (s.charAt(i)=='#'   && sb1.length()>=1){
                sb1.deleteCharAt(sb1.length()-1);
            }
             else if (s.charAt(i)!='#'){
                sb1.append(s.charAt(i));
            }

            
        }
        for(int i=0 ; i<t.length() ; i++){
            if(i==0  &&  t.charAt(i)!='#'){
                sb2.append(t.charAt(i));
            }
            else if (t.charAt(i)=='#' && sb2.length()>=1){
               sb2.deleteCharAt(sb2.length()-1);
            }
           else if (t.charAt(i)!='#'){
                sb2.append(t.charAt(i));
            }

            
        }

        System.out.println(sb1.toString() +" "+ sb2.toString());


        return sb1.toString().equals(sb2.toString());


    }
}