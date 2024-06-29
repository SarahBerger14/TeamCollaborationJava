package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * A test for the string queue class.
 */
public class StringQueueTest {

    /**
     * The string queue to test.
     */
    private StringQueue queue;

    /**
     * Sets up the test environment.
     */
    @BeforeEach
    public void setNew() {
        queue = new StringQueue(5);
        assertTrue(queue.offer("Test1"));
        assertTrue(queue.offer("Test2"));
        assertTrue(queue.offer("Test3"));
        assertTrue(queue.offer("Test4"));
        assertTrue(queue.offer("Test5"));
    }

    /**
     * Tests the offer() method.
     */
    @DisplayName("Testing offer() Method")
    @Test
    public void testOffer() {
        assertFalse(queue.offer("Test6"));
    }

    /**
     * Tests the poll() method.
     */
    @DisplayName("Testing poll() Method")
    @Test
    public void testPoll() {
        assertEquals("Test1", queue.poll());
        assertEquals("Test2", queue.poll());
        assertEquals("Test3", queue.poll());
        assertEquals("Test4", queue.poll());
        assertEquals("Test5", queue.poll());
        assertNull(queue.poll());
    }

    /**
     * Tests the remove() method.
     */
    @DisplayName("Testing remove() Method")
    @Test
    public void testRemove() {
        assertEquals("Test1", queue.remove());
        assertEquals("Test2", queue.remove());
        assertEquals("Test3", queue.remove());
        assertEquals("Test4", queue.remove());
        assertEquals("Test5", queue.remove());
        assertThrows(java.util.NoSuchElementException.class, queue::remove);
    }

    /**
     * Tests the peek() method.
     */
    @DisplayName("Testing peek() Method")
    @Test
    public void testPeek() {
        assertEquals("Test1", queue.peek());
        assertEquals("Test1", queue.peek());
        assertEquals("Test1", queue.peek());
        assertEquals("Test1", queue.peek());
    }

    /**
     * Tests the element() method.
     */
    @DisplayName("Testing element() Method")
    @Test
    public void testElement() {
        StringQueue queue = new StringQueue(5);
        queue.offer("Test1");
        queue.offer("Test2");
        queue.offer("Test3");
        assertEquals("Test1", queue.element());
        assertEquals("Test1", queue.element());
        assertEquals("Test1", queue.element());
    }

    /**
     * Tests the element() method.
     */
    @DisplayName("Testing element() Method")
    @Test
    public void testElementEmpty() {
        StringQueue queue = new StringQueue(5);
        assertThrows(java.util.NoSuchElementException.class, queue::element);
    }

    /**
     * Tests the peek() method.
     */
    @DisplayName("Testing peek() Method")
    @Test
    public void testPeekEmpty() {
        StringQueue queue = new StringQueue(5);
        assertNull(queue.peek());
    }
}
