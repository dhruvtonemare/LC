# 1089. Duplicate Zeros
# https://leetcode.com/problems/duplicate-zeros/

class Solution {
    public void duplicateZeros(int[] arr) {


        int n= arr.length;

        ArrayList<Integer> a = new ArrayList<>();

        int i=0 ;

        while(a.size()<n){
          

          if(arr[i]==0){
            a.add(0);
          }

          a.add(arr[i]);
         i++;
        }

        for(int j=0 ; j<n  ; j++){
            arr[j]=a.get(j);
        }


        
    }
}