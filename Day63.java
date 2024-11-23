Remove Duplicates from Sorted List
**********************************
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

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

 
 Approach 1
 **********
 //Space Complexity =>O(n)

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(head.val);
        ListNode ans = dummy;
        ListNode ptr = head.next;

        while(ptr!=null){
            if(ptr.val != dummy.val){
                ListNode temp = new ListNode(ptr.val);
                dummy.next = temp;
                dummy = dummy.next;
            }
            ptr = ptr.next;
        }
        return ans;
    }
}


Approach 2
**********
//Space Complexity => O(1)

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(head.val);
        ListNode ans = dummy;
        ListNode ptr = head.next;

        while(ptr!=null){
            if(ptr.val != dummy.val){
                dummy.next = ptr;
                dummy = dummy.next;
            }
            ptr = ptr.next;
        }
        dummy.next = null;
        return ans;
    }
}


  

Example 1:

Input: head = [1,1,2]
Output: [1,2]
  
Example 2:

Input: head = [1,1,2,3,3]
Output: [1,2,3]
