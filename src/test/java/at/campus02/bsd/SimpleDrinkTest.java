package at.campus02.bsd;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A test for the simple drink class.
 */
public class SimpleDrinkTest {

    /**
     * Tests the getVolume() method.
     */
    @DisplayName("Testing getVolume() Method")
    @Test
    public void testGetVolumeOne() {
        Liquid l = new Liquid("Water", 1, 0.0);
        SimpleDrink drink = new SimpleDrink("Water", l);
        assertEquals(1, drink.getVolume());
    }

    /**
     * Tests the getVolume() method.
     */
    @DisplayName("Testing getVolume() Method")
    @Test
    public void testGetVolumeTwo() {
        Liquid l = new Liquid("Cola", 3, 0.0);
        SimpleDrink drink = new SimpleDrink("Water", l);
        assertEquals(3, drink.getVolume());
    }

    /**
     * Tests the getAlcoholPercent() method.
     */
    @DisplayName("Testing getAlcoholPercent() Method")
    @Test
    public void testGetAlcoholPercentOne() {
        Liquid l = new Liquid("Beer", 0.5, 5.0);
        SimpleDrink drink = new SimpleDrink("Beer", l);
        assertEquals(5.0, drink.getAlcoholPercent());
    }

    /**
     * Tests the getAlcoholPercent() method.
     */
    @DisplayName("Testing getAlcoholPercent() Method")
    @Test
    public void testGetAlcoholPercentTwo() {
        Liquid l = new Liquid("Wine", 0.75, 12.0);
        SimpleDrink drink = new SimpleDrink("Wine", l);
        assertEquals(12.0, drink.getAlcoholPercent());
    }

    /**
     * Tests the getAlcoholPercent() method.
     */
    @DisplayName("Testing getAlcoholPercent() Method")
    @Test
    public void testGetAlcoholPercentThree() {
        Liquid l = new Liquid("Water", 1, 0.0);
        SimpleDrink drink = new SimpleDrink("Water", l);
        assertEquals(0.0, drink.getAlcoholPercent());
    }

    /**
     * Tests the isAlcoholic() method.
     */
    @DisplayName("Testing isAlcoholic() Method")
    @Test
    public void testIsAlcoholicOne() {
        Liquid l = new Liquid("Beer", 0.5, 5.0);
        SimpleDrink drink = new SimpleDrink("Beer", l);
        assertTrue(drink.isAlcoholic());
    }

    /**
     * Tests the isAlcoholic() method.
     */
    @DisplayName("Testing isAlcoholic() Method")
    @Test
    public void testIsAlcoholicTwo() {
        Liquid l = new Liquid("Lambrusco", 1, 0.34);
        SimpleDrink drink = new SimpleDrink("Lambrusco", l);
        assertTrue(drink.isAlcoholic());
    }

    /**
     * Tests the isAlcoholic() method.
     */
    @DisplayName("Testing isAlcoholic() Method")
    @Test
    public void testIsNotAlcoholic() {
        Liquid l = new Liquid("Water", 1, 0.0);
        SimpleDrink drink = new SimpleDrink("Water", l);
        assertFalse(drink.isAlcoholic());
    }
}