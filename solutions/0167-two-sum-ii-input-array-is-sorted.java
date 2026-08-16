# 167. Two Sum II - Input Array Is Sorted
# https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int [] result = new int[2]; 



        int left , right;

        left=0 ;

        right = numbers.length-1;


        while(left <right ){

            int current = numbers[left] + numbers[right];

            if(current==target){
                result[0]=left+1;
                result[1]=right+1;

                return result;

                
            }

            else if (current>target){

                right --;
            }

            else {
                left ++;
            }
        }


        return result ;
        
    }
}