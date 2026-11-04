package Medium;

public class SwapNodesInParis_24 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = first.next;
            ListNode next = second.next;
            second.next = first;
            first.next = next;
            prev.next = second;
            prev = first;
        }
        return dummy.next;
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.println("Before swapping:");
        printList(head);
        SwapNodesInParis_24 obj = new SwapNodesInParis_24();
        head = obj.swapPairs(head);
        System.out.println("After swapping Version:");
        printList(head);
    }
}