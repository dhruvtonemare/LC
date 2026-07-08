# 19. Remove Nth Node From End of List
# https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {


        //  calcylating first the size of the linked list

        ListNode  temp = head;
        int size =0;


        while(temp!= null){

            size++;
            temp=temp.next;
        }


        // if list is empty
        if(head == null|| head.next == null){
            return null;
        }




        // if delete  the  last node   from last of linked list
        //  means first of actual linked list
        if(size == n ){

            head = head.next;
            return head;
        }





        // to delete the first node from last 
        // in actual last noe from the linked list

        int go_till = size-n-1;
        ListNode tempp = head;


        if(n==0){

            
            for(int i = 0; i< go_till; i++){

                tempp = tempp.next;

            }

            // update 
            temp.next = null;

            return head;

        }
        else{


            for(int i = 0; i< go_till; i++){

                tempp = tempp.next;

            }

            // update 
            tempp.next = tempp.next.next;

            return head;




        }








      
        
    }
}