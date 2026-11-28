# 1394. Find Lucky Integer in an Array
# https://leetcode.com/problems/find-lucky-integer-in-an-array/

class Solution {
    public int findLucky(int[] arr) {

        int lucky=-1;

        HashMap<Integer,Integer>h = new HashMap<>();


        for(int i=0; i<arr.length;i++){

            if(h.containsKey(arr[i])){

                h.put(arr[i],h.get(arr[i])+1);
            }

            else{

                h.put(arr[i],1);


            }
            
        }

       

       for (int num : h.keySet()) {


        if(num==h.get(num) && num>lucky){

            lucky=num;
        }
    
}

        return lucky;
        
    }
}