public class Queue {
    public LinkedList list = new LinkedList();

    public void enqueue(Object element) {
        this.list.insertFirst(element);
    }

    public Node dequeue() {
        return this.list.deleteLast();
    }

    public Node peek() {
        return this.list.getLast();
    }
}
