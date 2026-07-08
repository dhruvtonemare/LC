# 2485. Find the Pivot Integer
# https://leetcode.com/problems/find-the-pivot-integer/

class Solution {
    public int pivotInteger(int n) {

        int pivot=-1;

        int [] prefix = new int [n];
        int [] suffix = new int [n];


        // form out the prefix array first 

        int current=0;

        for(int i =1 ; i <=n ; i++){
            current += i;

            prefix[i-1]=current;
        }

        current =0;

         for(int i =n ; i >=1 ; i--){
            current += i;

            suffix[i-1]=current;
        }


        // iterate over both the arrays when found a target return it 

        for(int i =0 ; i <n ; i++){
            if(prefix[i]==suffix[i]){
                return i+1;
            }
        }




        

        return pivot; /// return the pivot index ....
        
    }
}