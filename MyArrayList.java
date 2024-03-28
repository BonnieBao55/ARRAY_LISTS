import java.util.Arrays;

public class MyArrayList {
    private int[] elements;
    private int size;
    private final int CAPACITY = 10;
    

    public MyArrayList(){
        // create an array with an initialize size of 10
        elements = new int[CAPACITY]; // initial capacity
        size = 0;

        System.out.println(elements.length);
        System.out.println(Arrays.toString(elements));
    }
    
    public void addStart(int elementToAdd) {
        EnsureCapacity();
        for (int i = size; i >= size; i--){
            elements[i + 1] = elements[i];
        
        }

        elements[0] = elementToAdd;
        size++;

        System.out.println();
       
        }
    
    public void addEnd(int elementToAdd) {
        EnsureCapacity();
        elements[0] = elementToAdd; 
        size ++;
        }

        public int GetElementAtIndex(int index) {
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
            int[] newElements = new int[elements.length * 2];

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

    public void AddAtIndex(int elementsToAdd, int indexToAddAt) {
        if(indexToAddAt > size || indexToAddAt < 0) {
            addEnd(elementsToAdd);
        }

        EnsureCapacity();
        for (int i = size; i >= indexToAddAt; i--){
            elements[i + 1] = elements[i];

        elements[indexToAddAt] = elementsToAdd; 
        size ++;

        }

    }




        }

