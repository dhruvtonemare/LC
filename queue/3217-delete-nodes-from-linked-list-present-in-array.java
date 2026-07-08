# 3217. Delete Nodes From Linked List Present in Array
# https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/

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
    public ListNode modifiedList(int[] nums, ListNode head) {


        Set <Integer> arr= new HashSet<>();

        for(int i =0; i<nums.length;i++){

            arr.add(nums[i]);
        }

        while(head!=null&&arr.contains(head.val)){
            head=head.next;
        }

       ListNode temp = head;

       while(temp!=null && temp.next!=null){
           

           ListNode temp1 = temp.next;

           while(temp1!=null&&arr.contains(temp1.val)){

            temp1=temp1.next;
           }

           temp.next=temp1;
           temp=temp.next;


       }


        

     return head;
        
    }
}