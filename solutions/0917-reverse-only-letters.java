# 917. Reverse Only Letters
# https://leetcode.com/problems/reverse-only-letters/

class Solution {
    public String reverseOnlyLetters(String s) {

        int n= s.length();

        if(n==1){
            return s;
        }

        char [] arr = s.toCharArray();


        int left =0 ;

        int right= n-1;

        while(left<right){

           if(!Character.isLetter(arr[left])){
            left++;
           }
           else if(!Character.isLetter(arr[right])){
            right --;
           }

           else{
            char ch = arr[left];

            arr[left]=arr[right];
            arr[right]=ch;

            left ++;
            right--;


           }




        }


       String result = new String(arr);

       return result;

        
    }
}