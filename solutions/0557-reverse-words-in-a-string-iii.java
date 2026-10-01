# 557. Reverse Words in a String III
# https://leetcode.com/problems/reverse-words-in-a-string-iii/

class Solution {
    public String reverseWords(String s) {

       String [] arr = s.split(" ");

       StringBuilder x = new StringBuilder("");

       for(int i=0 ; i<arr.length ; i++){

        String n = arr[i];

        for(int j=n.length()-1 ; j>=0 ; j--){
            x.append(n.charAt(j));
        }

        if(i!=arr.length-1){
            x.append(" ");
        }

        
       }


        return x.toString();
    }
}