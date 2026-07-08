# 2810. Faulty Keyboard
# https://leetcode.com/problems/faulty-keyboard/

class Solution {
    public String finalString(String s) {

        int n= s.length();

        if(n==1){
            return s;
        }

        StringBuilder sb = new StringBuilder("");

        for(int i =0 ; i<n ; i++){

            if(s.charAt(i)=='i'){

                sb.reverse();
            }
            else{
                sb.append(s.charAt(i));
            }


        }



        return sb.toString();

        






        
    }
}