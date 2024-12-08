Merge k Sorted Lists
*******************
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        else if(lists.length == 1){
            return lists[0];
        }
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        for(int i=0;i<lists.length;i++){
            ListNode tempHead = lists[i];

            while(tempHead != null){
                pq.add(tempHead);
                tempHead=tempHead.next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode  ans = dummy;
        while(pq.size()>0){
            ListNode node = pq.remove();
            dummy.next=node;
            dummy=dummy.next;
        }
        dummy.next=null;
        return ans.next;
    }
}

Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6

Example 2:

Input: lists = []
Output: []

Example 3:

Input: lists = [[]]
Output: []
