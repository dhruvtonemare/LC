# 3289. The Two Sneaky Numbers of Digitville
# https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville/

class Solution {
    public int[] getSneakyNumbers(int[] nums) {

        Set<Integer>s = new HashSet<>();

        int[] arr = new int[2];

        int pos=0;

        for(int i=0 ; i<nums.length ; i++){

            if(s.contains(nums[i])){

                if(pos>=1){
                    arr[pos]=nums[i];
                    break;
                }
                else{
                    arr[pos]=nums[i];
                    s.remove(nums[i]);
                    pos++;
                }

            }

            s.add(nums[i]);
        }


        return arr;
        
    }
}