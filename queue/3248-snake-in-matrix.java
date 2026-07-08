# 3248. Snake in Matrix
# https://leetcode.com/problems/snake-in-matrix/

class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {


        int curr =0 ;

        for(int i=0 ; i<commands.size() ;i++){

            String x = commands.get(i);

            if(x.equals("DOWN")){
                curr+=n;
            }

           else if(x.equals("UP")){
                curr-=n;
            }

            else if(x.equals("RIGHT")){
                curr+=1;
            }

            else{
                curr-=1;
            }



        }


        return curr;
        
    }
}