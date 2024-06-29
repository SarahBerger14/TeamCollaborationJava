package at.campus02.bsd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A test for the drink queue class.
 */
public class DrinkQueueTest {

    /**
     * The drink queue to test.
     */
    private DrinkQueue drinkQueue;

    /**
     * Sets up the test environment.
     */
    @BeforeEach
    public void setUp() {
        drinkQueue = new DrinkQueue();
    }

    /**
     * Tests the offer() method.
     */
    @DisplayName("test Offer")
    @Test
    public void testOffer() {
        assertTrue(drinkQueue.offer(new Liquid("Vodka", 20, 40).getName()));
    }

    /**
     * Tests the poll() method.
     */
    @DisplayName("test poll")
    @Test
    public void testPoll() {
        assertEquals(null, drinkQueue.poll());
    }

    /**
     * Tests the remove() method.
     */
    @DisplayName("test Remove()")
    @Test
    public void testRemove() {
        assertThrows(NoSuchElementException.class, drinkQueue::remove);
    }

    /**
     * Tests the peek() method.
     */
    @DisplayName("test peek")
    @Test
    public void testPeek() {
       drinkQueue.offer("Bacardi");
       drinkQueue.offer("Schnaps");
       assertEquals("Bacardi", drinkQueue.peek());
    }

    /**
     * Tests the element() method.
     */
    @DisplayName("test Element()")
    @Test
    public void testElement() {
        drinkQueue.offer("Schnaps");
        assertEquals("Schnaps", drinkQueue.element());
    }
}
