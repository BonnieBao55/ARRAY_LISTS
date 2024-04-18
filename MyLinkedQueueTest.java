import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyLinkedQueueTest {
    private static final boolean EnQueue_EmptyQueue_ShouldAdd = false;

    @Test
    public void EnQueue_EmptyQueue_ShouldAdd() {
        //arrange
        MyLinkedQueue<String> myLinkedQueue = new MyLinkedQueue<String>();

        String expected = "World";
        //act
        myLinkedQueue.EnQueue(expected);


        //assert
        assertEquals(expected, myLinkedQueue.head.data); 
        assertEquals(expected, myLinkedQueue.tail.data); 

    }

    @Test
    public void EnQueue_QueueMultipleTimes_ShouldUpdateHeadTail(){

        String expectedHead = "Hello";
        String expectedTail = "World";
        //arrange
        MyLinkedQueue<String> myLinkedQueue = new MyLinkedQueue<String>();
        //Act
        myLinkedQueue.EnQueue(expectedHead);
        myLinkedQueue.EnQueue(expectedTail);


        //Assert
        assertEquals(expectedHead, myLinkedQueue.head); 
        assertEquals(expectedTail, myLinkedQueue.tail); 
    }
    @Test
    public void Dequeue_QueueMultipleTimes_ShouldRemoveFrontItem() {
        String expectedHead = "World";
        String expectedTail = "of Warcraft";
 
          //Arrange
          MyLinkedQueue<String> myLinkedQueue = new MyLinkedQueue<String>();
          myLinkedQueue.EnQueue("Hello");
          myLinkedQueue.EnQueue("World");
          myLinkedQueue.EnQueue("of Warcraft");
       
          //Act
          myLinkedQueue.Dequeue();
 
          //Assert
          assertEquals(myLinkedQueue.GetHead().data, expectedHead);
          assertEquals(myLinkedQueue.GetTail().data, expectedTail);
   
    }
 
    @Test
    public void Dequeue_QueueHasNoItems_ShouldLeaveHeadAsNull() {
          //Arrange
          MyLinkedQueue<String> myLinkedQueue = new MyLinkedQueue<String>();
       
          //Act
          myLinkedQueue.Dequeue();
 
          //Assert
          assertEquals(myLinkedQueue.GetHead(), null);
          
    }

    @Test
    public void Dequeue_QueueHasOneItems_ShouldSetHeadAndTailToNull() {
        //Arrange
        MyLinkedQueue<String> myLinkedQueue = new MyLinkedQueue<String>();

        myLinkedQueue.Dequeue();

        //assert
        assertEquals(null, myLinkedQueue.GetHead());
        assertEquals(null, myLinkedQueue.GetTail());

    }



}
