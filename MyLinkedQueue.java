public class MyLinkedQueue <T>{

    private static final int size = 0;
    Node<T> head, tail;
    public MyLinkedQueue(){
        head = null;
        tail = null;
    }

    //Getter for header or start of linked list
    public Node<T> GetHead() {
        return head;
    }
 
    //Getter for tail of end of linked list
    public Node<T> GetTail() {
        return tail;
    }


    //pass in our data we want to set the node equal to 
    public void EnQueue(T data) {
        Node<T> newNode = new Node<T>(data);

        if (tail == null && head == null){
            head = tail = newNode;//next null
            return;// ball out - do not pass go 
        }

        tail.next = newNode;
        tail = newNode;
        //instantlate the node
        //set the tail equal to the new 

        
    }

    public T Peek(){
        return head.data;

    }

    public T GetBack(){
        return tail.data;
    }

    public void Dequeue() {
        if (head == null) {
            return;
        }
 
        if (head == tail) {
            head = tail = null;
            return;
        }
 
      head = head.next;
    }
    
    public int length(){
        return size;
    }

    
}
