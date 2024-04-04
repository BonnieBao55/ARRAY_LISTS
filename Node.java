public class Node<T> {
    Node<T> next;

    public Node(T dt) {
        data = dt; 
        next = null;
    }

    public Node(T dt, Node<T> next) {
        data = dt; 
        this.next = next;
    }
}
