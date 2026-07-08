# 3019. Number of Changing Keys
# https://leetcode.com/problems/number-of-changing-keys/

class Solution {
    public int countKeyChanges(String s) {

        int n= s.length();

        if(n==1){
            return 0;
        }

        int change=0;

        for(int i=0 ; i<n ; i++){
            if(i!=0){
                char ch= s.charAt(i);
                char pc= s.charAt(i-1);

                if(Character.toLowerCase(ch)!=Character.toLowerCase(pc)){
                    change++;
                }
            }

        }


        return change;
        
    }
}