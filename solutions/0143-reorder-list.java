# 143. Reorder List
# https://leetcode.com/problems/reorder-list/

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
    public void reorderList(ListNode head) {

         if(head == null || head.next == null){
            return;
         }


        // find the middle of the linked list first 

        ListNode slow = head;
        ListNode fast= head;

        while(fast!=null  && fast.next!=null){
            slow = slow.next ;
            fast = fast.next.next;
        }

        ListNode second = reverse(slow.next);

        slow.next=null;

        ListNode first= head;

        while(second!=null){

            ListNode temp1= first.next;
            ListNode temp2= second.next;

            first.next=second ;
            second.next =temp1;

            first = temp1;
            second=temp2;



        }





       
        
        
    }

    public  ListNode reverse(ListNode node){

        ListNode prev= null;

        ListNode curr = node;

        while(curr!=null){

            ListNode forw = curr.next;
            curr.next=prev;
            prev=curr;

            curr=forw;




        }

        return prev;



    }
}