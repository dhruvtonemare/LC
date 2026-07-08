# 3075. Maximize Happiness of Selected Children
# https://leetcode.com/problems/maximize-happiness-of-selected-children/

class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {


        long happy=0;

        Arrays.sort(happiness);
        
        int i= happiness.length-1;
      
        int reduction =0;
        while(k>0){

            
            

           if(   happiness[i]-reduction>0){

               happy+=happiness[i]-reduction;


           }

           else{

            break;


           }
            
              i--;
              k--;
              
              reduction ++;

                
            


        }

        return happy;
        
    }
}