public class Solution
{
    public static Node reverseDLL(Node head)
    {
        // Write your code here.
        Node temp=null;
        Node current=head;
        while(current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        if(temp!=null){
            head=temp.prev;
        }
        return head;
    }
}