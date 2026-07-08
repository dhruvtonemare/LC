# 3069. Distribute Elements Into Two Arrays I
# https://leetcode.com/problems/distribute-elements-into-two-arrays-i/

class Solution {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer>a= new ArrayList<>(); 
        ArrayList<Integer>b= new ArrayList<>(); 

        a.add(nums[0]);
        b.add(nums[1]);
       

        for(int i=2 ; i<nums.length ; i++){

             int curr= nums[i];

             

             if(a.get(a.size()-1) > b.get(b.size()-1)){
                a.add(curr);
             }
             else{
                b.add(curr);
             }               

                            
      }

      int pos=0;

      int  [] result = new int[nums.length];

      for(int i=0 ; i<a.size() ; i++){

        result[pos]=a.get(i);
        pos++;
      }

      for(int i=0 ; i<b.size() ; i++){

        result[pos]=b.get(i);
        pos++;
      }



   return result;
        
    }
}