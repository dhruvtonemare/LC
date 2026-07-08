# 3921. Score Validator
# https://leetcode.com/problems/score-validator/

class Solution {
    public int[] scoreValidator(String[] events) {

        int c=0;

        int i=0 ;

        int ts=0; 

        while(i<events.length   && c!=10){

            String s= events[i];

            if(s.equals("W")){
                c++;
            }

            else if(s.equals("WD") ||  s.equals("NB")){
                ts+=1;
            }

            else{
                ts+=Integer.valueOf(s);
            }

            i++;
        }


        int  [] result = new int[2];

        result[0]=ts;
        result[1]=c;

        return result;
        
    }
}