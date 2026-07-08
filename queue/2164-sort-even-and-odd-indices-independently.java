# 2164. Sort Even and Odd Indices Independently
# https://leetcode.com/problems/sort-even-and-odd-indices-independently/

class Solution {
    public int[] sortEvenOdd(int[] nums) {

        if(nums.length ==1 || nums.length ==2 ){
            return nums;
        }

        ArrayList<Integer>odd = new ArrayList<>();

        ArrayList<Integer>even = new ArrayList<>();

        
        //collece elements at even & odd indices

        for(int i=0 ; i<nums.length ; i++){

            if(i%2 ==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);


        for(int i=0 ; i<nums.length ; i++){

            if(i%2 ==0){
                nums[i]= even.get(0);
                even.remove(0);

                
            }

            else{
                 nums[i]= odd.get(odd.size()-1);
                odd.remove(odd.size()-1);

            }
        }


        return nums;
        
    }
}