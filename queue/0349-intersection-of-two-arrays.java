# 349. Intersection of Two Arrays
# https://leetcode.com/problems/intersection-of-two-arrays/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

       ArrayList <Integer>  r = new ArrayList<>();
         int i = 0;
         int j=0;
        
        while(i<nums1.length &&j<nums2.length){

            if(nums1[i]== nums2[j]){

                if( r.isEmpty() ||   r.get(r.size()-1)!=nums1[i]){

                   r.add(nums1[i]);

                }
                i++;
                j++;
            }

               else  if(nums1[i]<nums2[j]){
                    i++;

                }
                else{
                    j++;
                }


            

            
         

        }
        int result []= new int [r.size()];

            for(int  k =0; k<  r.size(); k++){

                result[k]=  r.get(k);
            }

        return result;
    }
}