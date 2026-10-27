package Easy;
public class RemoveDuplicatesFromSortedList_83 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        for (int value : arr) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList_83 solution =  new RemoveDuplicatesFromSortedList_83();
        ListNode head = createList(new int[]{1, 1, 2, 3, 3, 4, 5, 5, 7, 7});
        System.out.println("Original Linked List:");
        printList(head);
        head = solution.deleteDuplicates(head);
        System.out.println("After Removing Duplicates:");
        printList(head);
    }
}
