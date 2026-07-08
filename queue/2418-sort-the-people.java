# 2418. Sort the People
# https://leetcode.com/problems/sort-the-people/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {


        HashMap<Integer,String>hm = new HashMap<>();

        for(int i =0 ; i<heights.length ; i++){

            hm.put(heights[i],names[i]);
        }

        Arrays.sort(heights);

       int pos=0;
        for(int i= heights.length -1 ; i>=0 ; i--){

            names[pos]=hm.get(heights[i]);
            pos++;
        }


        return names;
        
    }
}