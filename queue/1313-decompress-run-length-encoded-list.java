# 1313. Decompress Run-Length Encoded List
# https://leetcode.com/problems/decompress-run-length-encoded-list/

class Solution {
    public int[] decompressRLElist(int[] nums) {


        ArrayList<Integer>a = new ArrayList<>();

        int n= nums.length;


        for(int i=0; i<n ; i++){

            if(i%2 !=0){
                for(int j=0; j<nums[i-1];j++){
                    a.add(nums[i]);
                }
            }
        }

        int [] result = new int [a.size()];

        for(int i=0 ; i<a.size();i++){
            result[i]=a.get(i);
        }  

        return result;      
    }
}