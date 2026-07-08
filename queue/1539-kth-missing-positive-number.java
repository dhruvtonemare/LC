# 1539. Kth Missing Positive Number
# https://leetcode.com/problems/kth-missing-positive-number/

class Solution {
    public int findKthPositive(int[] arr, int k) {


        Set<Integer>s = new HashSet<>();

        for(int i=0 ; i<arr.length ; i++){
          
          s.add(arr[i]);
        }

        int a=0;

        for(int i=1 ; i<Integer.MAX_VALUE ; i++){

            if(!s.contains(i)){
                a++;
            }

            if(a>=k){
                return i;
            }
          
          
        }

         
         
        return -1;
    }
}