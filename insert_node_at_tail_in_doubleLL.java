public class Solution
{
    public static Node insertAtTail(Node list, int K) {
        // Write your code here'
        Node newnode=new Node(K);
        if(list==null){
           list=newnode;
        }
       else{
           Node temp=list;
           while(temp.next!=null){
            temp=temp.next;
            }
            temp.next=newnode;
            newnode.prev=temp;
            newnode.next=null;
       }
        return list;
    }
}