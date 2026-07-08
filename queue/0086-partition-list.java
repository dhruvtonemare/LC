# 86. Partition List
# https://leetcode.com/problems/partition-list/

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
    public ListNode partition(ListNode head, int x) {


        if(head == null){

            return head ;
        }

        ListNode dummy1=new ListNode(0);  ListNode dummy2=new ListNode(0);

        ListNode temp = head;

        ListNode d1= dummy1;

        ListNode d2= dummy2;


        

        while(temp!=null){



           if(temp.val<x){

            d1.next= temp;

            d1=d1.next;

            temp=temp.next;


           }

           else{

              d2.next= temp;

            d2=d2.next;

            temp=temp.next;


           }


           
          

           }

           d2.next=null;


           d1.next =dummy2.next;


           return dummy1.next;
        
    }
}