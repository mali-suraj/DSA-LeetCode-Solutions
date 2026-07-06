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
    public ListNode middleNode(ListNode head) {
        if(head==null)return null;

        ListNode n =head;
        int size=0;
        while(n!=null){
            size++;
            n=n.next;
        }
        int mid=size/2;
        n =head;
        for(int i=1;i<=mid;i++){
            n=n.next;

        }
        return n;
        
    }
}