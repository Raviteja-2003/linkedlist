public class Solution {
    public static int length(Node head){
        //Your code goes here
        Node temp=head;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}