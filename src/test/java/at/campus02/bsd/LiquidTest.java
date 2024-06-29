package at.campus02.bsd;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * A test for the liquid class.
 */
public class LiquidTest {

    /**
     * The liquid to test.
     */
    Liquid liquid;

    /**
     * Sets up the test environment.
     */
    @BeforeEach
    void setUp() {
        liquid = new Liquid("Malibu", 300, 20);
    }

    /**
     * Tests the getName() method.
     */
    @DisplayName("test getName()")
    @Test
    void testGetName() {
        assertEquals("Malibu", liquid.getName());
    }

    /**
     * Tests the setName() method.
     */
    @DisplayName("test setName()")
    @Test
    void testSetName() {
        liquid.setName("Vodka");
        assertEquals("Vodka", liquid.getName());
    }

    /**
     * Tests the getVolume() method.
     */
    @DisplayName("test getVolume()")
    @Test
    void testGetVolume() {
        assertEquals(300, liquid.getVolume());
    }

    /**
     * Tests the setVolume() method.
     */
    @DisplayName("test setVolume()")
    @Test
    void testSetVolume() {
        liquid.setVolume(200);
        assertEquals(200, liquid.getVolume());
    }

    /**
     * Tests the getAlcoholPercent() method.
     */
    @DisplayName("test getAlcoholPercent()")
    @Test
    void testGetAlcoholPercent() {
        assertEquals(20, liquid.getAlcoholPercent());
    }

    /**
     * Tests the setAlcoholPercent() method.
     */
    @DisplayName("test setAlcoholPercent()")
    @Test
    void testSetAlcoholPercent() {
        liquid.setAlcoholPercent(25);
        assertEquals(25, liquid.getAlcoholPercent());
    }
}
