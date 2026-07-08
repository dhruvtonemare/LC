# 2011. Final Value of Variable After Performing Operations
# https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int result =0;

        for(int i=0 ; i<operations.length ; i++){

            String x = operations[i];

            if(x.equals("X++")||x.equals("++X")){
                result++;
            }

            else{
                 result--;
            }
        }

        return result;
    }
}