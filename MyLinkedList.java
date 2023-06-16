public class MyLinkedList<E> {
    private class Node {
        public E element;
        public Node next;
        public Node(E element) {
            this.element = element;
            next = null;
        }
        public Node(E element, Node next) {
            this.element = element;
            this.next = next;
        }
        public String toString() {
            return "Node = " + this.element.toString();
        }
    }
    private int size;
    private Node head;

    public MyLinkedList() {
        this.size = 0;
        head = null;
    }
    public Node getNode(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void add(E element) {
        if (size == 0) {
            head = new Node(element);
        } else {
           Node node = head;
           while (node.next != null) node = node.next;
           node.next = new Node(element);
        }
        size++;
    }

    public void add(E element, int index) {
        if (index == 0) {
            Node newNode = new Node(element);
            newNode.next = head;
            head = newNode;
        } else {
            Node previousNode = getNode(index - 1);
            Node newNode = new Node(element);
            newNode.next = previousNode.next;
            previousNode.next = newNode;
        }
        size++;
    }

    public void delete(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node deleteNode = getNode(index);
            Node previousNode = head;
            while (previousNode.next != deleteNode) {
                previousNode = previousNode.next;
            }
            previousNode.next = deleteNode.next;
        }
        size--;
    }
}
