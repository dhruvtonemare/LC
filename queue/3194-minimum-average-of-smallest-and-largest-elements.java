# 3194. Minimum Average of Smallest and Largest Elements
# https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/

class Solution {
    public double minimumAverage(int[] nums) {


        Arrays.sort(nums);



        List<Double>avg= new ArrayList<>();


        int i =0 ; 

        int left =0;

        int right = nums.length-1;


        while(i<= nums.length/2){


            avg.add(((nums[left] + nums[right]) / 2.0));

            left ++;
            right --;
            i++;
        }


        double r  = Integer.MAX_VALUE;


        for(int j =0 ; j<avg.size();j++){

            if(r>avg.get(j))  r= avg.get(j);
        }

 

        
     return r;

    }
}