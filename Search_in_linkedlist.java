public class Solution
{
    public static int searchInLinkedList(Node head, int k)
    {
        // Write Your Code Here.
        Node temp=head;
        while(temp.next!=null){
            if(temp.data==k){
                return 1;
            }
            temp=temp.next;
        }
        if(temp.data==k){
            return 1;
        }
        return 0;
    }
}