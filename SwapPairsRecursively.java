package code2;


public class SwapPairsRecursively {

    // Recursive function to swap pairs of nodes
    public ListNode swapPairs(ListNode head) {
        // Base case: if the list is empty or has only one node, return head
        if (head == null || head.next == null) {
            return head;
        }
        
        // Nodes to be swapped
        ListNode first = head;
        ListNode second = head.next;
        
        // Recursively swap the rest of the list and connect it with the second node
        first.next = swapPairs(second.next);
        second.next = first;
        
        // Now the second node is the head of the swapped list
        return second;
    }

    // Recursive function to create a linked list from an array
    public ListNode createList(int[] values, int index) {
        // Base case: end of array
        if (index >= values.length) {
            return null;
        }
        
        // Create a new node
        ListNode node = new ListNode(values[index]);
        // Recursively create the rest of the list
        node.next = createList(values, index + 1);
        
        return node;
    }
    
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        SwapPairsRecursively sp = new SwapPairsRecursively();
        
        // Create a linked list 1 -> 2 -> 3 -> 4 using recursion
        int[] values = {1, 2, 3, 4};
        ListNode head = sp.createList(values, 0);
        
        System.out.println("Original List:");
        printList(head);
        
        // Swap pairs using recursion
        ListNode newHead = sp.swapPairs(head);
        
        System.out.println("List after swapping pairs:");
        printList(newHead);
    }
}
