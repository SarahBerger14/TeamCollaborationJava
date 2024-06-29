package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DrinkQueueTest {
    private DrinkQueue drinkQueue;
    @BeforeEach
    public void setUp() {
        drinkQueue = new DrinkQueue();
    }

    @DisplayName("test Offer")
    @Test
    public void testOffer() {
        assertTrue(drinkQueue.offer(new Liquid("Vodka", 20, 40).getName()));
    }

    @DisplayName("test poll")
    @Test
    public void testPoll() {
        assertEquals(null, drinkQueue.poll());
    }
    @DisplayName("test Remove()")
    @Test
    public void testRemove() {
        assertThrows(NoSuchElementException.class, drinkQueue::remove);
    }

    @DisplayName("test peek")
    @Test
    public void testPeek() {
       drinkQueue.offer("Bacardi");
       drinkQueue.offer("Schnaps");
       assertEquals("Bacardi", drinkQueue.peek());
    }

    @DisplayName("test Element()")
    @Test
    public void testElement() {
        drinkQueue.offer("Schnaps");
        assertEquals("Schnaps", drinkQueue.element());
    }


}
