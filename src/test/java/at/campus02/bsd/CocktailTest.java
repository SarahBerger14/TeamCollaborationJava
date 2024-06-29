package at.campus02.bsd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for cocktails
 */
public class CocktailTest {
    /**
     * The cocktail to test.
     */
    Cocktail cocktail;

    /**
     * Sets up the test environment.
     */
    @BeforeEach
    public void setUp() throws Exception {
        List<Liquid> liquids = new ArrayList<Liquid>();
        liquids.add(new Liquid("Vodka", 10,40));
        liquids.add(new Liquid("Orange juice", 50,0));
        cocktail = new Cocktail("Sex on the Beach", liquids);
    }

    /**
     * Tests the getVolume() method.
     */
    @DisplayName("Testing getVolume() Method")
    @Test
    void testGetVolume() {
        assertEquals(60, cocktail.getVolume());
    }

    /**
     * Tests the getAlcoholPercent() method.
     */
    @DisplayName("Testing getAlcoholPercent() Method")
    @Test
    void testGetAlcoholPercent() {
        assertEquals(((double) 4 /60*100), cocktail.getAlcoholPercent());
    }

    /**
     * Tests the isAlcoholic() method.
     */
    @DisplayName("Testing isAlcoholic() Method")
    @Test
    void testIsAlcoholic() {
        assertTrue(cocktail.isAlcoholic());
    }

    /**
     * Tests the getName() method.
     */
    @DisplayName("Testing getName() Method")
    @Test
    void testGetName() {
        assertEquals("Sex on the Beach", cocktail.getName());
    }

    /**
     * Tests the setName() method.
     */
    @DisplayName("Testing setName() Method")
    @Test
    void testSetName() {
        cocktail.setName("Mojito");
        assertEquals("Mojito", cocktail.getName());
    }
}
