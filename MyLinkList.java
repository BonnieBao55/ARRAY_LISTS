public class MyLinkList<T> {
    Node<T> head;

    public class MyLinkedList<T>{
        private node<T> head = null;
        privita int size = 0;
    }


    public void AddFront(T data){
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void Append(T data){
        Node<T> currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next

        }
        // once we have our current last note
        Node<T> newNode = new Node<T>(data);//create the new node and ensure it's next is null
        currentNode.next = newNode;// set the next of the old last 

    }

    @Override
    public String toString(){

        String returnString = "";

        while (currentNode != null) {
            returnString += " " + currentNode.data.toString();
            currentNode = currentNode.next;
        }
        return returnString;
    }
}
