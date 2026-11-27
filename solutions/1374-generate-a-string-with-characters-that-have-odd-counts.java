# 1374. Generate a String With Characters That Have Odd Counts
# https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/

class Solution {
    public String generateTheString(int n) {


        if(n==1){
            return "a";
        }

        StringBuilder sb= new StringBuilder("");
        if(n%2==0){
            for(int i=0 ; i<n-1 ; i++){
                
                sb.append("a");
            }
            sb.append("b");

            return sb.toString();
        }


         for(int i=0 ; i<n ; i++){
                sb.append("a");
            }
            

            return sb.toString();

        


        
       
        
    }
}