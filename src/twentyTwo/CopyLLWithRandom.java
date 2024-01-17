package twentyTwo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CopyLLWithRandom {

// Definition for a Node.
private static class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

    public static void main(String[] args) {
        //[7,null],[13,0],[11,4],[10,2],[1,0]
        Node zero = new Node(7);
        Node one = new Node(13);
        Node two = new Node(11);
        Node three = new Node(10);
        Node four = new Node(1);

        zero.next = one;
        one.next = two;
        one.random = zero;
        two.next = three;
        two.random = four;
        three.next = four;
        three.random = two;
        four.random = zero;

        Node root = copyRandomList(zero);

        System.out.println("all done");

    }

    public static Node copyRandomList(Node head) {
        if (head == null) return null;
        //declare the variables we will need
        Map<Node,Node> oldToNewMap = new HashMap();
        Node current = head, currentOther = null, newHead = null;
        int i = 0;

        //don't have to worry about null b/c of edge case checking
        //intitialize new list
        newHead = new Node(head.val);
        currentOther = newHead;
        oldToNewMap.put(current,currentOther);

        //copy list and cache indexes of otherList nodes
        while (current != null && current.next != null) {
            currentOther.next = new Node(current.next.val);
            oldToNewMap.put(current.next,currentOther.next);

            current = current.next;
            currentOther = currentOther.next;
        }

        //reset currentOther and current
        current = head;
        currentOther = newHead;
        //loop through once more to assign random pointers
        //we will get the index of current's random pointer from randomIndexMap
        //and then get the node at that index in new list with newListMap
        while (current != null) {
            if (current.random != null) currentOther.random = oldToNewMap.get(current.random);
            current = current.next;
            currentOther = currentOther.next;
        }
        return newHead;
    }
}
