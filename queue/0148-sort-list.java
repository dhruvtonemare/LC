# 148. Sort List
# https://leetcode.com/problems/sort-list/

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
    public ListNode sortList(ListNode head) {

        ListNode temp = head;

        int n=0;

        while(temp!=null){
            n++;
            temp=temp.next;
        }

        int [] arr = new int [n];

                ListNode temp_n = head;
                int i=0;

                  while(temp_n!=null){
                    arr[i]=temp_n.val;
                    i++;
            
            temp_n=temp_n.next;
        }

        Arrays.sort(arr);

        ListNode f = head;

        int j=0;
        while(j<n){
            f.val=arr[j];
            j++;
            f= f.next;
        }




        return head;
        
    }
}