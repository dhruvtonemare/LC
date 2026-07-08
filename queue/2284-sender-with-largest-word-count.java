# 2284. Sender With Largest Word Count
# https://leetcode.com/problems/sender-with-largest-word-count/

class Solution {
    public String largestWordCount(String[] messages, String[] senders) {


        // using a map add the count 
        // the intution is if there are n spaces then there are n+1 words 

        int n= senders.length;




        HashMap<String, Integer>hm = new HashMap<>();

        for(int i=0 ; i<n ; i++){

            String sender= senders[i];
            int mess_len=messages[i].split(" ").length;
            
            if(hm.containsKey(sender)){
                hm.put(sender,hm.get(sender)+mess_len);
            }
            else{
                hm.put(sender,mess_len);
            }
        }

        int max = Integer.MIN_VALUE;
        
         String ans="";

        for(String i : hm.keySet()){
             
             int curr= hm.get(i);

             if(curr > max || (curr == max && i.compareTo(ans) > 0)){
                max=curr;
                ans=i;
                
             }
            

          
        }

      return ans;
        



        
    }
}