# 3842. Toggle Light Bulbs
# https://leetcode.com/problems/toggle-light-bulbs/

class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {


        Set<Integer>s = new HashSet<>();

        for(int i=0 ; i<bulbs.size(); i++){

            if(s.contains(bulbs.get(i))){
                s.remove(bulbs.get(i));
            }
            else{
                s.add(bulbs.get(i));
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int val : s){
            result.add(val);
        }

       Collections.sort(result);

       return result; 
        
    }
}