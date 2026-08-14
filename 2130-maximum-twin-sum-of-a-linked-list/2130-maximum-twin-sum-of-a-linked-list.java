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
        List<Integer> list=new ArrayList<>();
        ListNode i=head;
            

        while(i!=null){
            list.add(i.val);
            i=i.next;
        }
        int a=0,
            j=list.size()-1;
            int max=Integer.MIN_VALUE;

            while(a<j){
                int candidat=list.get(a)+list.get(j);
                max=Math.max(max,candidat);
                a=a+1;
                j=j-1;

            }
            return max;
        
    }
}