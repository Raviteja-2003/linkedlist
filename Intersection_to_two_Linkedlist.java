//optimal approach1
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummy1=headA;
        ListNode dummy2=headB;
        while(dummy1!=dummy2){
            dummy1= dummy1==null?headB:dummy1.next;
            dummy2=dummy2==null?headA:dummy2.next;
        }
        return dummy1;
    }
}
//optimal approach2
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp=headA;
        int cnt1=0;
        while(temp!=null){
            cnt1++;
            temp=temp.next;
        }
        ListNode temp2=headB;
        int cnt2=0;
        while(temp2!=null){
            cnt2++;
            temp2=temp2.next;
        }
        int d=Math.abs(cnt1-cnt2);
        ListNode d1=headA;
        ListNode d2=headB;
        for(int i=0;i<d;i++){
            if(cnt1>cnt2){
                d1=d1.next;
            }else{
                d2=d2.next;
            }
            
        }
        while(d1!=null || d2!=null){
            if(d1==d2){
                return d1;
            }
            d1=d1.next;
            d2=d2.next;
        }
        return null;
    }
}