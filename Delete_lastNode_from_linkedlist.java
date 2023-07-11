public class Solution {
    public static Node deleteLast(Node list){
        // Write your code here
        if(list == null || list.next == null){
            list = null;
            return list;
        }
        Node current=list;
        while(current.next.next!=null){
            current=current.next;
        }
        current.next=null;
        return list;

    }
}