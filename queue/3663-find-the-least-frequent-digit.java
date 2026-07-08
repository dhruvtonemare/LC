# 3663. Find The Least Frequent Digit
# https://leetcode.com/problems/find-the-least-frequent-digit/

class Solution {
    public int getLeastFrequentDigit(int n) {

        HashMap<Integer,Integer>hm = new HashMap<>();

       int x=n;

       while(x>0){
        int d= x%10;

        if(hm.containsKey(d)){
            hm.put(d,hm.get(d)+1);   
                 }

    else{
           hm.put(d,1); 
       }

       x/=10;
       }


       int min=Integer.MAX_VALUE;

       int result=Integer.MAX_VALUE;

         x=n;
       while(x>0){
        int curr = x % 10;
            int freq = hm.get(curr);

            if (freq < min) {
                min = freq;
                result = curr;
            } 
           
            else if (freq == min) {
                result = Math.min(result, curr);
            }

            x/=10;
       }


       

      

     return result;
        
    }
}