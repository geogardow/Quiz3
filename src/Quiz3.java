public class Quiz3 {
    private Queue queue;

    public static void main(String[] args) {
        // Se crea el Queue
        Queue queue = new Queue();
        //Se agregan elementos al queue
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(3);
        queue.enqueue(12);
        queue.enqueue(0);
        queue.enqueue(89);
        queue.enqueue(77);
        //Se imprime el queque
        System.out.println("El Queue se imprime a continuación");
        printQueue(queue);
        //Se hace dequeue
        System.out.println("\nElementos eliminados");
        System.out.println(queue.dequeue().getData());
        System.out.println(queue.dequeue().getData());
        System.out.println(queue.dequeue().getData());
        //Se imprime nuevamente
        System.out.println("\nEl Queue se imprime nuevamente");
        printQueue(queue);
    }
    public static void printQueue(Queue queue){
        //Función peek, toma los elementos sin eliminarlos
        Node a;
        a = queue.peek();
        while (a!=null){
            System.out.println(a.getData());
            a=a.next;
        }
    }
}
