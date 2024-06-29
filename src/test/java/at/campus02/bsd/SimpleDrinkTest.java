package at.campus02.bsd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleDrinkTest {

    @Test
    public void testGetVolumeOne() {
        Liquid l = new Liquid("Water", 1, 0.0);
        SimpleDrink drink = new SimpleDrink("Water", l);
        assertEquals(1, drink.getVolume());
    }

    @Test
    public void testGetVolumeTwo() {
        Liquid l = new Liquid("Cola", 3, 0.0);
        SimpleDrink drink = new SimpleDrink("Water", l);
        assertEquals(3, drink.getVolume());
    }

    @Test
    public void testGetAlcoholPercentOne() {
        Liquid l = new Liquid("Beer", 0.5, 5.0);
        SimpleDrink drink = new SimpleDrink("Beer", l);
        assertEquals(5.0, drink.getAlcoholPercent());
    }

    @Test
    public void testGetAlcoholPercentTwo() {
        Liquid l = new Liquid("Wine", 0.75, 12.0);
        SimpleDrink drink = new SimpleDrink("Wine", l);
        assertEquals(12.0, drink.getAlcoholPercent());
    }

    @Test
    public void testGetAlcoholPercentThree() {
        Liquid l = new Liquid("Water", 1, 0.0);
        SimpleDrink drink = new SimpleDrink("Water", l);
        assertEquals(0.0, drink.getAlcoholPercent());
    }

    @Test
    public void testIsAlcoholicOne() {
        Liquid l = new Liquid("Beer", 0.5, 5.0);
        SimpleDrink drink = new SimpleDrink("Beer", l);
        assertTrue(drink.isAlcoholic());
    }

    @Test
    public void testIsAlcoholicTwo() {
        Liquid l = new Liquid("Lambrusco", 1, 0.34);
        SimpleDrink drink = new SimpleDrink("Lambrusco", l);
        assertTrue(drink.isAlcoholic());
    }

    @Test
    public void testIsNotAlcoholic() {
        Liquid l = new Liquid("Water", 1, 0.0);
        SimpleDrink drink = new SimpleDrink("Water", l);
        assertFalse(drink.isAlcoholic());
    }
}