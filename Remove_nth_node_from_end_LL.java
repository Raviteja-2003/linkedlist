//optimal approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start= new ListNode();
        start.next=head;
        ListNode slow=start;
        ListNode fast=start;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return start.next;

    }
}
//brute approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        if(head==null || head.next==null){
            return null;
        }
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
        count=count-n;
        if(count==0){
            return head.next;
        }
        ListNode temp2=head;
        while(temp2!=null){
            count--;
            if(count==0){
                temp2.next=temp2.next.next;
                break;
            }
            temp2=temp2.next;
        }
        return head;
    }
}