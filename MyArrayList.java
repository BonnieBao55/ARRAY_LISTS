import java.util.Arrays;

public class MyArrayList<T> {
    private Object[] elements;
    private int size;
    private final int CAPACITY = 10;
    

    public MyArrayList(){
        // create an array with an initialize size of 10
        elements = new Object[CAPACITY]; // initial capacity
        size = 0;

        //System.out.println(elements.length);
        //System.out.println(Arrays.toString(elements));
    }
    
    public void addStart(T elementToAdd) {
        EnsureCapacity();
        for (int i = size; i >= 0; i--){
            elements[i + 1] = elements[i];
        
        }

        elements[0] = elementToAdd;
        size++;

        //System.out.println();
       
        }
    
    public void addEnd(T elementToAdd) {
        EnsureCapacity();
        elements[size] = elementToAdd; 
        size ++;
        }
    
    // public void addAtIndex(T elementToAdd,int indexToAddAt){
    //     if(indexToAddAt > size || indexToAddAt < 0){
    //         addEnd(elementToAdd);
    //     }else{
    

        public Object GetElementAtIndex(int index) {
            if (index > size || index < 0){
                return elements[size -1];
            }

            return elements[index];
        }
/**
 * Check the capacity of our elements array and 
 * Increases its capacity if there isn't enough space 
 */
    private void EnsureCapacity(){
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];

            for (int i = 0; i < size; i ++){
                newElements[i] = elements[i];
            }
            elements = newElements;
        }

    }


    public void Print(){
        for(int i = 0; i < size; i++){
            System.out.print(elements[i] + " ");

        } 
        System.out.println();
    }

    public void AddAtIndex(T elementsToAdd, int indexToAddAt) {
        if(indexToAddAt > size || indexToAddAt < 0) {
            addEnd(elementsToAdd);
        }
        else{       

        EnsureCapacity();
        for (int i = size; i >= indexToAddAt; i--){
            elements[i + 1] = elements[i];

        elements[indexToAddAt] = elementsToAdd; }
        size++;

        
    }
    }

    public void DeleteAtStart(){
        DeleteAtIndex(0);
    }
    public void DeleteAtEnd(){
        DeleteAtIndex(size -1);
    

    }


    public void DeleteAtIndex(int indexOfValueToDelete) {
        if(indexOfValueToDelete < 0 || indexOfValueToDelete >= size ) {
            throw new IndexOutOfBoundsException(
                "Index" + indexOfValueToDelete + "is invalid for Arraylist of size " + size );
        
        }
        for(int i = indexOfValueToDelete; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public void ClearAll(){
        for(int i = 0; i < size; i++) {
            elements[i] = 0;
        }
        size = 0;
    }

    public boolean IsEmpty(){
        return size == 0;

    }
    public int Size() {
        return size; 
    }

        }

