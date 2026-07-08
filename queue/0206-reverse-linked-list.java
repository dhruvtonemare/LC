# 206. Reverse Linked List
# https://leetcode.com/problems/reverse-linked-list/

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
    public ListNode reverseList(ListNode head) {


        if(head == null|| head.next == null){

            return head;

        }


        //Iterative approach  three pointers

        ListNode prev = null;
        ListNode  curr = head ;
        ListNode  neext  = curr;



        while(curr!= null){

        neext = curr.next;
        curr.next = prev;
        prev = curr;
        curr = neext;

        }



         return prev;


        



        
    }
}