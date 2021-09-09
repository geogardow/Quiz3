public class Quiz3 {
    private Queue queue;


    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(3);
        queue.enqueue(12);
        queue.enqueue(0);
        queue.enqueue(89);
        queue.enqueue(77);
        
        System.out.println("El Queue se imprime a continuación");
        printQueue(queue);

        System.out.println("\nElementos eliminados");
        System.out.println(queue.dequeue().getData());
        System.out.println(queue.dequeue().getData());
        System.out.println(queue.dequeue().getData());

        System.out.println("\nEl Queue se imprime nuevamente");
        printQueue(queue);
    }
    public static void printQueue(Queue queue){
        Node a;
        a = queue.peek();
        while (a!=null){
            System.out.println(a.getData());
            a=a.next;
        }
    }
}
