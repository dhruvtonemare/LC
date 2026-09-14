# 402. Remove K Digits
# https://leetcode.com/problems/remove-k-digits/

class Solution {
    public String removeKdigits(String num, int k) {

        int n=  num.length();

        if(n==k){
            return "0";
        }


        Stack <Integer> s = new Stack<>();

        int i =0;

        while( i<n){

           int current = Character.getNumericValue(num.charAt(i));

            // Remove larger previous digits
            while (!s.isEmpty() && k > 0 && s.peek() > current) {
                s.pop();
                k--;
            }

            s.push(current);
            i++;
        }

        while (!s.isEmpty() && k > 0) {
            s.pop();
            k--;
        }

        

        StringBuilder sb= new StringBuilder(s.size());

         while (!s.isEmpty()) {
            char ch = (char) (s.pop() + '0');   // correct conversion
            sb.append(ch);
        }

        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // If empty, return 0
        if (sb.length() == 0) {
            return "0";
        }

        return sb.toString();
        
        
    }
}