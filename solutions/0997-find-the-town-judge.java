# 997. Find the Town Judge
# https://leetcode.com/problems/find-the-town-judge/

class Solution {
    public int findJudge(int n, int[][] trust) {


        int row = trust.length;
        
        
        Set<Integer>s = new HashSet<>();
        int[] trustCount = new int[n+1];


        for(int i=0 ; i<row ; i++){

            s.add(trust[i][0]);
            trustCount[trust[i][1]]++;

        }

        for(int i=1 ; i<=n; i++){
            if(!s.contains(i) && trustCount[i] == n - 1){
                return i;
            }
        }


        

           return -1;


        
    }
}