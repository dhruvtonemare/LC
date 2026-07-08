# 868. Binary Gap
# https://leetcode.com/problems/binary-gap/

class Solution {
    public int binaryGap(int n) {

        int max= Integer.MIN_VALUE;

        StringBuilder sb= new StringBuilder("");

        while(n>0){
            sb.append(n%2);
            n/=2;


        }

        sb.reverse();

        int last=0;

        for(int i=0 ; i<sb.length(); i++){

            int current=i;

            if(sb.charAt(i)=='1'){
              int  distance = Math.abs(last-current);
                max = Math.max(distance , max );
                last=i;

            }
        }

        return max;
        
    }
}