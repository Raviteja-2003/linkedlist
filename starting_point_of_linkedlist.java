//optimal
public class Solution {
    public ListNode detectCycle(ListNode head) {
       if(head==null ||head.next==null){
           return null;
       }
       ListNode slow=head;
       ListNode fast=head;
       ListNode collide=head;
       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
           if(slow==fast){
               while(slow!=collide){
                slow=slow.next;
                collide=collide.next;
                }
                return slow;
           }  
       }
       return null;
       
    }
}

//brute force
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hs=new HashSet<>();
        ListNode temp=head;
        while(temp!=null){
            if(hs.contains(temp)){
                return temp;
            }
            else{
                hs.add(temp);
            }
            temp=temp.next;
        }
        return null;
    }
}