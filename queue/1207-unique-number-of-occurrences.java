# 1207. Unique Number of Occurrences
# https://leetcode.com/problems/unique-number-of-occurrences/

class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap <Integer, Integer>hm = new HashMap<>();

        for(int i=0 ; i<arr.length ; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }

            else{
                hm.put(arr[i], 1);
            }
        }

        Set<Integer>s =new HashSet<>();

        for(int i:hm.keySet()){
            
            if(s.contains(hm.get(i))){
                return false;
            }

            s.add(hm.get(i));
        }

        return true;
        
    }
}