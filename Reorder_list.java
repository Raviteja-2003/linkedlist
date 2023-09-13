class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode nex=null;
        ListNode temp=head;
        while(temp!=null){
            prev=temp.next;
            temp.next=nex;
            nex=temp;
            temp=prev;
        }
        return nex;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondhalf=reverse(slow.next);
        slow.next=null;
        ListNode firsthalf=head;
        while(secondhalf!=null){
            ListNode temp1=firsthalf.next;
            ListNode temp2=secondhalf.next;
            firsthalf.next=secondhalf;
            secondhalf.next=temp1;
            firsthalf=temp1;
            secondhalf=temp2;
        }
        
    }
}