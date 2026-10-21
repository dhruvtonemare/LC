# 806. Number of Lines To Write String
# https://leetcode.com/problems/number-of-lines-to-write-string/

class Solution {
    public int[] numberOfLines(int[] widths, String s) {


        int line=0;

        int i=0 ;

        int curr =0;

        int last =0;

        while(i<s.length()){

            while(i<s.length() && curr<=99){

                int cp = widths[s.charAt(i)-'a'];



                if(cp+curr<=100){
                    i++;
                    curr+=cp;
                }
                else{
                    
                    break;

                }

               
            }
             line++;
             last= curr;
                curr=0;


          



            
        }


          int []  res = new int[2];

            res[0]=line;

            res[1]=last;

            return res;





        
    }
}