# 3827. Count Monobit Integers
# https://leetcode.com/problems/count-monobit-integers/

class Solution {
    public int countMonobit(int n) {

      int count =0 ;

      for(int i=0 ; i<=n ;i++){

        String x= tobinary(i);
        
        boolean ismono= true;

        for(int j=1; j<x.length(); j++){

            
            if(x.charAt(j)!=x.charAt(j-1)){
                ismono=false;
                break;
            }

           
            }

            if(ismono){
                count++;
            }
        

      }

      return count ;
        
    }
    public String tobinary(int x){
        StringBuilder sb=new StringBuilder("");
        while(x>0){
            sb.append(x%2);
            x/=2;
        }
         return sb.toString();
    }
}