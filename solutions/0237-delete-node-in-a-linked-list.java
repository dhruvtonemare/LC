# 237. Delete Node in a Linked List
# https://leetcode.com/problems/delete-node-in-a-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {


       ListNode temp = node;


       ListNode temp_1 = node.next;

       temp.val=temp_1.val;

       temp_1=temp_1.next;

       temp.next=temp_1;

       

      
    }
}