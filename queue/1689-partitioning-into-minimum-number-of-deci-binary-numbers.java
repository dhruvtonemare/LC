# 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
# https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/

class Solution {
    public int minPartitions(String n) {

        int max= Integer.MIN_VALUE;

        for(int i=0 ; i<n.length(); i++){

            if(Integer.valueOf(n.charAt(i) - '0')>max){
                max=Integer.valueOf(n.charAt(i) - '0');
            }
        }


        return max;

        
    }
}