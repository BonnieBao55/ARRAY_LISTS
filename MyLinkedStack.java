public class MyLinkedStack<T> {
    private Node<T> head = null;

    ///**will create a new Node and add it to the top of the stack 
    //*@param data the data which should be populated in the the Node
     //*/
    public void push(T data){
        Node<T> newNode = new Node<T>(data, head);
        head = newNode;
    }

    /**
     * Allows for retrieving the top item on the stack 
     * @return the top item data (or head)
     */

    public T peek(){
        if (head == null)
           return null;

        return head.data;

    public T pop(){
        if (head == null)
        return null;

        T topElementData = head.data;
        head = head.next;
        return head.data;

    
    }

    public boolean isEmpty(){
        return head == null;
    }

    /**
     * Clear the entire list at one time 
     */
    public void Clear(){
        head = null;
    }
}
