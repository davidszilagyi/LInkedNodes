package main;

/**
 * Created by David Szilagyi on 2017. 07. 04..
 */
public class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

    public boolean hasLoop() {
        Node slow = this;
        Node fast = this;
        while (true) {
            slow = slow.next;
            if (slow.next != null) {
                fast = fast.next.next;
            }
            if (slow == null || fast == null) {
                return false;
            }
            if (slow == fast) {
                return true;
            }
        }
    }

    public void listNodes() {
        System.out.println(data);
        if (this.next != null) {
            this.next.listNodes();
        }
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
