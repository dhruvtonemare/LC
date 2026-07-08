# 3507. Minimum Pair Removal to Sort Array I
# https://leetcode.com/problems/minimum-pair-removal-to-sort-array-i/

class Solution {
    public int minimumPairRemoval(int[] nums) {

         int n= nums.length;

      if(n==1 ){
        return 0;
      }

      if(n==2){

        if(nums[0]<=nums[1]){
            return 0;
        }
        else{
            return 1;
        }


      }

      

      ArrayList<Integer> a = new ArrayList<>();
for (int num : nums) {
    a.add(num);
}

      if(isSorted(a)){
        return 0;
      }

      int moves =0;

      //by traversing taking window of two size find the minimum sum ;





     while(!isSorted(a)){

        int min= Integer.MAX_VALUE;

        int x=0;

        for(int i=0 ; i<a.size()-1;i++){
            int current= a.get(i)+a.get(i+1);

            if(min>current){
                min=current;
                x=i;
            }
        }

        a.set(x,min);
        a.remove(x+1);
        moves ++;
        
     }





      return moves;
      


        
    }

    public boolean isSorted(ArrayList <Integer> a ){

        int n= a.size();

        for(int i=0 ; i<n-1 ; i++){

            if(a.get(i) > a.get(i + 1)){
                return false;
            }
        }

        return true;

        
    }
}