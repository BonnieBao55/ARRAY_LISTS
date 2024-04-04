import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void addStart_Add_ArrayListToContainOne(){
        //Arrange
        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();

        //Act
        myArrayList.addStart(20);


        //Assert
        assertEquals(myArrayList.size(), 1 );
        assertEquals(myArrayList.GetElementAtIndex(0), 20);
    }
}
