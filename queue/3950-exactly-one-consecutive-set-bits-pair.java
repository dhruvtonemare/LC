# 3950. Exactly One Consecutive Set Bits Pair
# https://leetcode.com/problems/exactly-one-consecutive-set-bits-pair/

class Solution {
    public boolean consecutiveSetBits(int n) {

        StringBuilder sb = new StringBuilder("");

        while(n>0){

            sb.append(n%2);

            n/=2;
        }

        int count =0;

        for(int i=0 ; i<sb.length()-1 ; i++ ){

            if(sb.charAt(i) =='1' && sb.charAt(i+1) =='1' ){

                count++;
                 
            }
        }

        System.out.println(sb.toString());
        return count==1;
        
    }
}