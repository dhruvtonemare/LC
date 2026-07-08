# 2956. Find Common Elements Between Two Arrays
# https://leetcode.com/problems/find-common-elements-between-two-arrays/

class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {


        Set<Integer>s = new HashSet<>();
        Set<Integer>ss = new HashSet<>();


        for(int i=0 ; i<nums1.length ;i++){

            s.add(nums1[i]);
        }

        for(int i=0 ; i<nums2.length ;i++){

            ss.add(nums2[i]);
        }

        int c1=0;
        for(int i=0 ; i<nums1.length ;i++){

            if(ss.contains(nums1[i])){
                c1++;
            }
        }
         

         int c2=0;
         for(int i=0 ; i<nums2.length ;i++){

            if(s.contains(nums2[i])){
                c2++;
            }
        }

        int [] res = new int[2];


        res[0]=c1;
        res[1]=c2;

        return res;

        





        
    }
}