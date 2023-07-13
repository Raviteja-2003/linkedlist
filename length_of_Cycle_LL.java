
public class Solution
{
    public static int lengthOfLoop(Node head) {
        // Write your code here
        if(head==null || head.next==null) return 0;
        Node slow=head;
        Node fast=head;
        int count=0;
        boolean exists=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                exists=true;
                break;
            }
        }
        if(exists){
            count=1;
            fast=fast.next;
            while(slow!=fast){
                count++;
                fast=fast.next;
            }
            return count;
        }
        else{
            return 0;
        }
    }
}