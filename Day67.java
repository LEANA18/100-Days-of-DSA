Intersection of Two Linked Lists
********************************
Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

Program
********
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public int sizeLL(ListNode head){
        int count=0;
        ListNode ptr = head;

        while(ptr!=null){
            count++;
            ptr = ptr.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int size1 = sizeLL(headA);
        int size2 = sizeLL(headB);

        int difference = size1-size2;

        ListNode ptr1 = headA;
        ListNode ptr2 = headB;

        if(difference>0){
            while(difference>0){
                ptr1 = ptr1.next;
                difference--;
            }
        }
        else{
            while(difference<0){
                ptr2 = ptr2.next;
                difference++;
            }
        }
        while(ptr1!=ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
}

