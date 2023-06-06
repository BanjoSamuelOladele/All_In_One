package Data_Structures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue queue;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        queue = new Queue(5);
    }
    @Test
    public void objectExist() {
        assertNotNull(queue);
    }
    @Test
    public void queueIsEmptyByDefault() {
        Assertions.assertTrue(queue.isEmpty());
    }
    @Test
    public void queueIsNotEmptyWhenElementIsAddedToIt() {
        queue.enqueue("Get");
        Assertions.assertFalse(queue.isEmpty());
    }
    @Test
    public void sizeOfTheQueueCanBeGottenAfterAdding() {
        queue.enqueue("Get");
        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals(1, queue.size());
    }
    @Test
    public void confirmTheSizeIsActuallyTheSizeAfterTwoElementsAreAdded() {
        queue.enqueue("Get");
        queue.enqueue("Get");
        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals(2, queue.size());
    }
    @Test
    public void elementsAddedCanAlsoBeRemoved() {
        queue.enqueue("Get");
        Assertions.assertFalse(queue.isEmpty());
        queue.dequeue();
        Assertions.assertEquals(0, queue.size());
    }
    @Test
    public void twoElementsAddedOneRemoved() {
        queue.enqueue("Get");
        queue.enqueue("Get");
        Assertions.assertFalse(queue.isEmpty());
        queue.dequeue();
        Assertions.assertEquals(1, queue.size());
    }
    @Test public void canGetElementOnTheFirstPosition(){
        queue.enqueue("Ope");
        queue.enqueue("Tayo");
        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals("Ope", queue.peek());
    }
    @Test public void canGetElementOnTheFirstPositionAgain(){
        queue.enqueue("Tayo");
        queue.enqueue("Ope");
        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals("Tayo", queue.peek());
    }
    @Test public void removedElementGotten(){
        queue.enqueue("Tayo");
        queue.enqueue("Ope");
        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals("Tayo", queue.dequeue());
    }
    @Test public void removedElementGottenAgain(){
        queue.enqueue("Ope");
        queue.enqueue("Tayo");
        Assertions.assertFalse(queue.isEmpty());
        Assertions.assertEquals("Ope", queue.dequeue());
    }
    @Test public void removedFromAnEmptyQueue(){
        Assertions.assertTrue(queue.isEmpty());
        Assertions.assertEquals(0, queue.size());
        assertNull(queue.dequeue());
    }
}