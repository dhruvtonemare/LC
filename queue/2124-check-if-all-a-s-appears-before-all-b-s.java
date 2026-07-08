# 2124. Check if All A's Appears Before All B's
# https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/

class Solution {
    public boolean checkString(String s) {

       

        if(s.length()==1 && s.charAt(0)=='a'){

            return true ;
            
        }

        
        int n=s.length();

        // find the first b

        int j=0;

        while(  j<n && s.charAt(j)!='b' ){

            if(s.charAt(j)!='b'){
                j++;
            }

        
        }


        // check if any a comes after that b 

        for(int i = j; i<n; i++){

            if(s.charAt(i)=='a'){

                return false;



            }


       }

       




        return true ;

        

        
    }
}