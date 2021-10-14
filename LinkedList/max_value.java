import java.util.*;
 class max_value{
    public static void main(String[]args){
        ListNode head=new ListNode(-1);
        ListNode h=head;
        int c=0;
        while(c<10){
            head.next=new ListNode(c++);
            head=head.next;
        }
        
        int no=number(h);
        System.out.println(no);
    }
    public static int number(ListNode node){
        int c=-100000;
        while(node!=null){
            c=Math.max(c,node.val);
            node=node.next;
        }
        return c;
    }
}
 class ListNode{
    int val=0;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}