# 1894. Find the Student that Will Replace the Chalk
# https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/

class Solution {
    public int chalkReplacer(int[] chalk, int k) {


        int i=0 ;

        while(k>=chalk[i]){

            k-=chalk[i];

            if(i==chalk.length-1){
                i=0;
                continue;

            }
            i++;
        }

        return i;
        
    }
}