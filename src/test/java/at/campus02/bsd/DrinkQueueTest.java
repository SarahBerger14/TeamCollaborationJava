package at.campus02.bsd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
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
    private Cocktail magarita;
    private Liquid water;
    private Liquid vodka;
    private List<Liquid> liquids;
    private Cocktail cocktail2;
    private SimpleDrink simpleDrink;

    /**
     * Sets up the test environment.
     */
    @BeforeEach
    public void setUp() {
        drinkQueue = new DrinkQueue();
        vodka = new Liquid("Vodka", 200, 40);
        water = new Liquid("Water", 200, 0);
        liquids = new ArrayList<>();
        liquids.add(vodka);
        liquids.add(water);
        magarita = new Cocktail("magerita", liquids);
        cocktail2 = new Cocktail("coktail2", liquids);
        simpleDrink = new SimpleDrink("simpleDrink", water);

    }

    /**
     * Tests the offer() method.
     */
    @DisplayName("test Offer")
    @Test
    public void testOffer() {
        assertTrue(drinkQueue.offer(magarita));
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
       drinkQueue.offer(magarita);
       drinkQueue.offer(simpleDrink);
       assertEquals(magarita, drinkQueue.peek());
    }

    /**
     * Tests the element() method.
     */
    @DisplayName("test Element()")
    @Test
    public void testElement() {
        drinkQueue.offer(cocktail2);
        assertEquals(cocktail2, drinkQueue.element());
    }
}
