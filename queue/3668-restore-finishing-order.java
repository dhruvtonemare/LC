# 3668. Restore Finishing Order
# https://leetcode.com/problems/restore-finishing-order/

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {

        Set<Integer> s= new HashSet<>();

        for(int i=0 ; i<friends.length; i++){
            s.add(friends[i]);
        }

        int x=0;

         for(int i=0 ; i<order.length; i++){
            if(s.contains(order[i])){
                friends[x]=order[i];
                x++;
            }
        }

        return friends;
        
    }
}