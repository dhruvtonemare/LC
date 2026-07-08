# 2130. Maximum Twin Sum of a Linked List
# https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/

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
    public int pairSum(ListNode head) {


        ArrayList <Integer> a = new ArrayList<>();

        ListNode temp = head;

        while(temp!=null){

            a.add(temp.val);
            temp=temp.next;
        }


        int l=0;
        int h= a.size()-1;
        

        int max = -1;

        while(l<h){

            int curr= a.get(l)+a.get(h);

            max= Math.max(curr,max);

            l++;
            h--;
        }


        return max;


        
    }
}