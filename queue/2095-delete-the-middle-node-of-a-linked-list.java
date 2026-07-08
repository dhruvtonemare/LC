# 2095. Delete the Middle Node of a Linked List
# https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/

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
    public ListNode deleteMiddle(ListNode head) {

        if(head.next == null ){
            return null;
        }
        else if(head.next.next==null){
            head.next=null;
            return head;
        }


        int i=0;
        ListNode s= head;
        ListNode f =head;
        ListNode mb = head;

        while(f!=null && f.next!=null){

            if(i>0){
                s=s.next;
                f=f.next.next;
                mb=mb.next;
            }
            else{
                s=s.next;
                f=f.next.next;
                i++;

            }
        }


        mb.next= s.next;
        System.out.println(mb.val);
           System.out.println(s.val);

        return head;


        
    }
}