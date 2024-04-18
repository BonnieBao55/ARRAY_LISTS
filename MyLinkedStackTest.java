import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyLinkedStackTest {
    // @Test
    // public void Push_AddNodeWhenListIsEmpty_ShouldSuccessfullyAdd() {
    //     String expected = "Hello";
    //     //arrange
    //     MyLinkedStack<String> myLinkedStack = new MyLinkedStack<>();

    //     //Act
    //     myLinkedStack.push("Hello");
    //     //myLinkedStack.push("World");

    //     //assert
    //     assertEquals("Hello", myLinkedStack.Peek().data);


        private static final Object expectedString = null;

        @Test
        public void pop_WhenListIsEmpty_ShouldReturnElementThatIsRemoved(){
            //arrange
            MyLinkedStack<String> myLinkedStack = new MyLinkedStack<String>();
            myLinkedStack.push("hello");

            //Act
            String removedElement = myLinkedStack.pop();

            //assert
            assertEquals(expectedString, removedElement);
            assertEquals(null, myLinkedStack.peek()); 
            
        }







    }

