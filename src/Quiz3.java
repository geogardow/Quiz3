public class Quiz3 {

    public static void main(String[] args) {
        // Create an empty linked list
        LinkedList linked_list = new LinkedList();

        // Insert some elements in the list
        linked_list.insertFirst(3);
        linked_list.insertFirst(8);
        linked_list.insertFirst(9);
        linked_list.insertFirst(1);

        // Get and print the size of the list.
        // It should match the number of elements we inserted
        int size = linked_list.size();

        System.out.println(size);
    }
}
