package twentyFour;

public class DetectLLCycle {

    public boolean hasCycle(ListNode head) {
        // This is a fun one
        // Which we can solve with the tortoise and the hare
        // The hare takes two steps each time, the tortoise takes one
        // If the hare reaches the end, no cycle
        // If the hare and the tortoise are ever on the same node, cycle
        // Just need to be careful about null pointer exceptions

        ListNode hare = head;
        ListNode tortoise = head;

        while (hare != null && hare.next != null) {
            hare = hare.next.next;
            tortoise = tortoise.next;

            if (hare == tortoise) return true;
        }

        return false;

        // Time complexity: O(n) as we may have to visit all nodes
        // Space complexity: O(1) as we can do this with just two contestant extra variables
    }
}
