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
    public int hcf(int a,int b){
         while(b!=0){
             int temp=b;
             b=a%b;
             a=temp;
         }
        return a;
    }
    ArrayList<Integer> ar=new ArrayList<>();
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        while(temp.next!=null){
            int a=hcf(temp.val,temp.next.val);
            ar.add(a);
            temp=temp.next;
        }
        ListNode temp1=head;
        int i=0;
        while(temp1.next!=null){
            ListNode b=new ListNode(ar.get(i));
            ListNode next=temp1.next;
            temp1.next=b;
            b.next=next;
            temp1=next;
            i++;
        }
        return head;
    }
}