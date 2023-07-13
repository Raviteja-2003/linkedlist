class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
       ListNode oddhead=head;
       ListNode evenhead=head.next;
       ListNode oddtail=oddhead;
       ListNode eventail=evenhead;
       while(eventail!=null && eventail.next!=null){
           oddtail.next=eventail.next;
           oddtail=oddtail.next;
           eventail.next=oddtail.next;
           eventail=eventail.next;
       }
       oddtail.next=evenhead;
       return oddhead;
    }
}