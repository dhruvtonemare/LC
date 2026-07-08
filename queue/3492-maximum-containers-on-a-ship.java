# 3492. Maximum Containers on a Ship
# https://leetcode.com/problems/maximum-containers-on-a-ship/

class Solution {
    public int maxContainers(int n, int w, int maxWeight) {

        int tot=0;
        int capacity=0;


        for(int i=1 ; i<= n*n ; i++){

            capacity+=w;

            if(capacity>maxWeight){

                break;

            }

            else{
                tot++;
            }



            


        }

       return tot;
        
    }
}