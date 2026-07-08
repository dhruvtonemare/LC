# 876. Middle of the Linked List
# https://leetcode.com/problems/middle-of-the-linked-list/

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
    public ListNode middleNode(ListNode head) {


        // if  empty return head 

        if(head == null){
            return head;
        }

        // counting the size  

        int size = 0;


        ListNode temp = head;

        while(temp!= null){
            size++;
         temp = temp.next;
         

        }



        // find the middle  
        ListNode sp = head;

                ListNode fp = head;
        while (fp != null && fp.next != null) {
        sp = sp.next;
        fp = fp.next.next;
    }
        
        return sp;
    }
}