//public class mergeKSortedList {
//
//
//    // O(N) --> N == maxLen(head1, head2)
//
//    public ListNode mergeTwoSortedLists(ListNode head1, ListNode head2) {
//        if (head1 == null && head2 == null) return null;
//
//        if (head1 == null) return head2;
//        if (head2 == null) return head1;
//
//        ListNode dummy = new ListNode(-1);
//        ListNode prev = dummy;
//
//        ListNode c1 = head1;
//        ListNode c2 = head2;
//
//        while(c1 != null && c2 != null) {
//
//            if (c1.val > c2.val) {
//                prev.next = c2;
//                prev = c2;
//                c2 = c2.next;
//            } else {
//                prev.next = c1;
//                prev = c1;
//                c1 = c1.next;
//            }
//
//        }
//
//        prev.next = (c1 == null) ? c2 : c1;
//
//        return dummy.next;
//    }
//
//
//    //O ==> N ^ (K-const) : N --> avg len of all the list and k is lenght of lists
//    public ListNode helper(ListNode[] lists) {
//
//        ListNode result = null;
//        // K iterations
//        for (int i = 0; i < lists.length; i++) {
//            result = mergeTwoSortedLists(lists[i], result);
//        }
//
//        return result;
//    }
//
//
//
//    // N * k * log(k) --> N: avg len of all the list
//    public ListNode mergeHelper(ListNode[] lists, int low, int high) {
//
//        if (low == high) {
//            return lists[low];
//        }
//
//        int mid = low + (high - low) / 2;
//
//        ListNode left = mergeHelper(lists, low, mid);
//        ListNode right = mergeHelper(lists, mid + 1, high);
//
//        return mergeTwoSortedLists(left, right);
//
//    }
//
//    public ListNode mergeKLists(ListNode[] lists) {
//        if (lists.length == 0) return null;
//        ListNode ans = mergeHelper(lists, 0, lists.length - 1);
//        return ans;
//    }
//}