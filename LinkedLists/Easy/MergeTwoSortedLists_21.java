package Easy;
public class MergeTwoSortedLists_21 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }
        return dummy.next;
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

        MergeTwoSortedLists_21 solution = new MergeTwoSortedLists_21();
        ListNode list1 = createList(new int[]{1, 2, 9});
        ListNode list2 = createList(new int[]{1, 3, 4});
        ListNode merged = solution.mergeTwoLists(list1, list2);
        System.out.println("Merged Linked List:");
        printList(merged);
    }
}
