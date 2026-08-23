# 203. Remove Linked List Elements
# https://leetcode.com/problems/remove-linked-list-elements/

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
    public ListNode removeElements(ListNode head, int val) {

      
      
      if(head == null){
         return head;
      }
        
        

        //  if the head and all the  values are the   same VALUE


        while(head != null  &&  head.val == val  ){

            head = head.next;

        }


        ListNode temp = head;




        while(temp!= null   && temp.next != null){



            while(temp.next!= null && temp.next.val == val){
           

             temp.next= temp.next.next;


            }

            temp = temp.next;
        }


    return head;
    }
}