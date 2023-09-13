class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        // code here
        
        ArrayList<ArrayList<Integer>> ar=new ArrayList<>();
        Node temp=head;
        while(temp!=null && temp.next!=null){
            temp=temp.next;
        }
        Node temp2=temp;
        Node temp1=head;
        while( temp1!=null && temp2!=null && temp1.data<temp2.data){
            ArrayList<Integer> pair=new ArrayList<>();
            int sum=temp1.data+temp2.data;
            if(sum==target){
                pair.add(temp1.data);
                pair.add(temp2.data);
                ar.add(pair);
                temp1=temp1.next;
                temp2=temp2.prev;
            }else if(sum>target){
                temp2=temp2.prev;
            }
            else{
                temp1=temp1.next;
            }
            
        }
        return ar;
    }
}