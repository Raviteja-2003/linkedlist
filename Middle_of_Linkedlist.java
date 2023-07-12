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
       ListNode slow=head;
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       return slow;
    }
}
//bruteforce
class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode temp2=head;
        int i=0;
        count=count/2+1;
        while(temp2!=null){
            i++;
            if(i==count){
                return temp2;
            }
            temp2=temp2.next;
        }
        return head;
    }
}