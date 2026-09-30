# 551. Student Attendance Record I
# https://leetcode.com/problems/student-attendance-record-i/

class Solution {
    public boolean checkRecord(String s) {


        if(s.length () ==1  ){

            return true;
        }

        int a =0 ;

        int l=0;
        


        for(int i=0 ; i<s.length() ;i++){

            if(s.charAt(i)=='A'){
                a++;
                l=0;

                if(a>=2){
                    return false;
                }
            }

            if(s.charAt(i)=='L'){
                l++;

                if(l>=3){
                    return false;
                }
            }

            else{
                l=0;
            }
        }


        return true;
        
    }
}