public class LinkedList {
    private Node head;
    private Node last;
    private int size;

    public Node getLast() {
        return last;
    }

    public LinkedList() {
        this.head = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        return this.size;
    }

    public void insertFirst(Object data) {
        Node newNode = new Node(data);
        newNode.prev = this.head;
        if (this.isEmpty()) {
            this.last = newNode;
        } else {
            if (this.size==1) {
                this.last.next = newNode;
            }
            this.head.next = newNode;
        }
        this.head = newNode;
        this.size++;
    }

    public Node deleteLast() {
        if (this.head != null) {
            Node temp = this.last;
            this.last = this.last.next;
            this.size--;
            return temp;
        } else {
            return null;
        }
    }
}
