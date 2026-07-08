# 2553. Separate the Digits in an Array
# https://leetcode.com/problems/separate-the-digits-in-an-array/

class Solution {
    public int[] separateDigits(int[] nums) {

      ArrayList <Integer> a = new ArrayList<>();

      for(int i =nums.length-1 ; i>=0 ; i--){
        int current = nums[i];

        while(current>0){
            int d = current%10;
            a.add(d);
            current/=10;
        }
      }

      int result [] = new int [a.size()];

      int pos=0;

      for(int i=a.size()-1 ; i>=0 ; i--){

        result[pos]=a.get(i);
        pos++;
        
      }


        return result;
    }
}