import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        CombinationSum c = new CombinationSum();
        /*ListNode list=new ListNode(1);
        list.next=new ListNode(4);
        list.next.next=new ListNode(5);
        ListNode list2=new ListNode(1);
        list2.next=new ListNode(3);
        list2.next.next=new ListNode(4);
        ListNode list3=new ListNode(2);
        list3.next=new ListNode(6);*/
     /*   ListNode head1 = new ListNode(2, new ListNode(4, new ListNode(6)));
        ListNode head2 = new ListNode(1, new ListNode(5));
        ListNode head3 = new ListNode(1, new ListNode(1, new ListNode(3, new ListNode(7))));
        ListNode head4 = new ListNode(8);*/

        // Populate the lists vector
       // ArrayList lists = new ArrayList<>();
/*
        ArrayList<ListNode> lists=new ArrayList<>();
        lists.add(head1);
        lists.add(head2);
        lists.add(head3);
        lists.add(head4);*/

        ListNode[] arr = new ListNode[3];

        arr[0] = new ListNode(1);
        arr[0].next = new ListNode(3);
        arr[0].next.next = new ListNode(5);

        arr[1] = new ListNode(2);
        arr[1].next = new ListNode(4);
        arr[1].next.next = new ListNode(6);

        arr[2] = new ListNode(0);
        arr[2].next = new ListNode(9);
        arr[2].next.next = new ListNode(10);
        c.mergeKLists(arr);
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists==null||lists.length==0)
            return null;
        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(lists.length ,(a,b) -> a.val-b.val);
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;

        for (ListNode node:lists)
            if (node!=null)
                queue.add(node);

        while (!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;

            if (tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
    }

}





