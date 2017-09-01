package code.datastructure.LinkedList;

//Generic implementation of a singly linked list. Implement the add & length method & print the list.
public class MyLinkedList<T> {
    Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node [data=" + data + ", next=" + next + "]";
        }
    }

    public void printList() {
        Node<T> n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public void addToTail(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            getTail().next = new Node<T>(data);
        }
    }

    public void addToHead(T data) {
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> newNode = new Node<T>(data);
            newNode.next = head;
            head = newNode;
        }
    }

    public void addAfterANode(Node prevNode, T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public Node<T> getTail() {
        if (head != null) {
            Node<T> n = head;
            while (n.next != null) {
                n = n.next;
            }
            return n;
        } else {
            return null;
        }
    }

    public int length() {
        int length = 0;
        Node<T> n = head;
        while (n != null) {
            length += 1;
            n = n.next;
        }
        return length;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();

        list.addToTail(1);
        list.addToTail(2);
        list.addToTail(3);
        list.addToTail(75);
        list.addToTail(9875);
        list.addToHead(5);
        list.addAfterANode(list.head.next, 345);

        list.printList();

        System.out.println("length of the list is: " + list.length());
        System.out.println(list.isEmpty());
    }
}
