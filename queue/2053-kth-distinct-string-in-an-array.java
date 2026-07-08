# 2053. Kth Distinct String in an Array
# https://leetcode.com/problems/kth-distinct-string-in-an-array/

class Solution {
    public String kthDistinct(String[] arr, int k) {


        HashMap<String , Integer> hm = new HashMap<>();


        for(int i=0 ; i<arr.length; i++){

            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }

            else{

                 hm.put(arr[i],1);

            }
        }

         for(int i=0 ; i<arr.length; i++){

            int freq=hm.get(arr[i]);
            

            if(freq==1  && k-1==0){

                return arr[i];
            }

            else if(freq==1){
                k--;
            }




            
        }



    return "";
        
    }
}