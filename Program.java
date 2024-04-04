import java.util.ArrayList;
import java.util.Arrays;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4};
        int[] arr1 = new int[3];
        
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> arrList1 = new ArrayList<>();

        arrList1.add(5);
        arrList1.add(10);

        ArrayList<Integer> arrList2 = new ArrayList<Integer>();

        arrList.add(1);
        arrList.add(3);
        arrList.add(4);
        //arrList.addAll(arrList1);

        // MyArrayList<Integer> myFirstList = new MyArrayList<Integer>();
        // myFirstList.addEnd(3);
        // myFirstList.addEnd(7);
        // myFirstList.addEnd(1);
        // //myFirstList.Print();
        // myFirstList.addStart(2);
        // //myFirstList.Print();
        // myFirstList.AddAtIndex(300, 2);
        // //myFirstList.Print();
        // myFirstList.AddAtIndex(800, -1);
        // myFirstList.Print();
        // myFirstList.AddAtIndex(900, 100);
        // myFirstList.Print();
        // myFirstList.DeleteAtIndex(3);
        // myFirstList.Print();

        // try{
        //     myFirstList.DeleteAtIndex(3);
        //     myFirstList.Print();
        //     myFirstList.DeleteAtStart();
        //     myFirstList.Print();
        //     myFirstList.DeleteAtEnd();
        //     myFirstList.Print();
        // } catch(Exception exception){
        //     System.out.println(exception);
        // }

        // myFirstList.ClearAll();
        // myFirstList.Print();
        // System.out.println(myFirstList.IsEmpty());


        //System.out.println();
        Public static void main(String[] args){
            MyLinkedList<String> MyLinkedList = new MyLinkedList<String>;
            MyLinkedList.AddFront("World!");
            myLinkedList.AddFront("Hello!");
            myLinkedList.AddFront("Hi");
            myLinkedList.Append("Dog");
            System.out.println(myLinkedList.GetSize());
            System.out.println(myLinkedList); 

        }


        
    }

}