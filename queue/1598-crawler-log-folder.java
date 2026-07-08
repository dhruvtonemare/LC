# 1598. Crawler Log Folder
# https://leetcode.com/problems/crawler-log-folder/

class Solution {
    public int minOperations(String[] logs) {

        Stack <String>s = new Stack<>();

        s.push("main");

        for(int i =0 ; i<logs.length; i++){

            String curr = logs[i];

            if(curr.equals("../") && s.peek()!="main"){
                s.pop();
            }

            else if(curr.length()>=2 && (curr.charAt(curr.length()-1)=='/'  && curr.charAt(curr.length()-2)!='.')){
                s.push(curr);
            }



            

        }


        if(s.peek()=="main"){
            return 0;
        }

        int ops =0;

        while(s.peek()!="main"){
            ops++;
            s.pop();
        }

        return ops;
        
    }
}