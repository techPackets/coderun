package code.datastructure.LinkedList;

public class DoublyLinkedList {
    Node head;

    private static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node [data=" + data + ", next=" + next + ", prev=" + prev + "]";
        }

    }

    public void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void SortedInsert(Node head, int data) {
        Node tmp = head;
        Node prevN = null;

        if (tmp == null) {
            Node n = new Node(data, null, null);
            this.head = n;
            this.printList(this.head);
        } else {
            while (tmp != null) {
                Node n = new Node(data, tmp, tmp.prev);
                if (tmp.data > data) {
                    tmp.prev = n;

                    if (tmp == head) {
                        this.head = n;
                    } else {
                        prevN.next = n;
                    }
                } else {
                    while (tmp.data < data) {
                        prevN = tmp;
                        tmp = tmp.next;
                    }
                }
            }

            this.printList(this.head);
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.SortedInsert(null, 2);
        dl.SortedInsert(dl.head, 5);
        dl.SortedInsert(dl.head, 4);
    }

}
