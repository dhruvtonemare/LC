# 496. Next Greater Element I
# https://leetcode.com/problems/next-greater-element-i/

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {


        // first find next greater elemnt for every element possible 

        int n= nums2.length;

        HashMap<Integer,Integer>h = new HashMap<>();



        int [] greats= new int[n];

        Stack<Integer>s = new Stack <>();

        for(int i= n-1; i>=0; i--){

            int current = nums2[i];


            while(!s.isEmpty()  && s.peek()<=current){

                s.pop();
            }

            if(s.isEmpty()){
                greats[i]=-1;
            }
            else{
                greats[i]=s.peek();
            }

            s.push(current);

           h.put(current,greats[i]);

           



        }


        int x = nums1.length;

        int [] result = new int[x];

        for(int i =0 ; i<x; i++){

            result[i]=  h.get(nums1[i]);
        }

        return result;
        
    }
}