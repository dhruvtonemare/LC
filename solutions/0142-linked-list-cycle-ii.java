# 142. Linked List Cycle II
# https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {


        if(head == null  || head.next == null){
            return  null;

        }



        ListNode sp = head;
        ListNode fp = head;
        ListNode pos = head;

        while(fp!= null && fp.next!= null){

             sp = sp.next;
             fp = fp.next.next;

            
            if(sp == fp){

                ListNode entry = head;

                while(entry != sp){
                    sp = sp.next;
                    entry = entry .next;

                }
                return entry;
               

            }
          
        }


        
      return null;


        
    }
}