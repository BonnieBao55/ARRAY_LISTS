import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void addStart_Add_ArrayListToContainOne(){
        //Arrange
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();

        //Act
        myArrayList.addStart(20);
        myArrayList.addStart(18);
        myArrayList.addStart(819);
        myArrayList.addStart(1);


        //Assert
        assertEquals(myArrayList.Size(), 4 );
        assertEquals(myArrayList.GetElementAtIndex(0), 1);
        assertEquals(myArrayList.GetElementAtIndex(1), 819);
        assertEquals(myArrayList.GetElementAtIndex(2), 18);
        assertEquals(myArrayList.GetElementAtIndex(3), 20);
    }
}
