Remove Nth Node From End of List
******************************
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Program
*******
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
     if(head == null){
        return null;
     }   
     ListNode Fast = head;
     ListNode Slow = head;

     while(n>0){
        Fast=Fast.next;
        n--;
     }
     if(Fast == null){
        return head.next;
     }
     while(Fast.next != null){
        Fast = Fast.next;
        Slow = Slow.next;
     }
     Slow.next = Slow.next.next;
     return head;
    }
}

Example 1:

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:

Input: head = [1], n = 1
Output: []

Example 3:

Input: head = [1,2], n = 1
Output: [1]
