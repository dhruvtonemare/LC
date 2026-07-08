# 3295. Report Spam Message
# https://leetcode.com/problems/report-spam-message/

class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {

        Set<String>s = new HashSet<>();

        for(int i=0 ; i<bannedWords.length ; i++){

            s.add(bannedWords[i]);
        }


        int count =0;

        for(int i=0 ; i<message.length ; i++){

            String x = message[i];

            if(count>=2){
                return true;
            }

            if(s.contains(x)){
                count++;
            }
        }


        if(count>=2){
            return true;
        }
        return false;
    }
}