# 2181. Merge Nodes in Between Zeros
# https://leetcode.com/problems/merge-nodes-in-between-zeros/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {

        if(head.next.next == null){
            return null;
        }

        ListNode d= head;

        // move to first non-zero;

        ListNode temp = head;

        while(temp.val ==0){
            temp=temp.next;
        }

        ListNode dp = d;

        int curr = 0;

        while(temp!= null){

            curr+= temp.val;

            if(temp.val==0){

              ListNode du= dp.next;
              du.val=curr;
              dp=dp.next;
              curr=0;
            }
            

          temp=temp.next;

        }


        d=d.next ;

        dp.next= null;
        return d;
        
    }
}