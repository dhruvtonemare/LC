# 2951. Find the Peaks
# https://leetcode.com/problems/find-the-peaks/

class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        
       ArrayList <Integer>a = new ArrayList<>();

        

         for(int i=1 ; i<mountain.length-1;i++){
              
              if(mountain[i]>mountain[i+1] && mountain[i-1]<mountain[i]){

                a.add(i);
              }

            }


            return a;
        }
        
    }
