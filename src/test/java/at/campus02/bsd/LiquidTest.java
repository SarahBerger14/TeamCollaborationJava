package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiquidTest {
    Liquid liquid;

    @BeforeEach
    void setUp() {
        liquid = new Liquid("Malibu", 300, 20);
    }

    @DisplayName("test getName()")
    @Test
    void testGetName() {
        assertEquals("Malibu", liquid.getName());
    }

    @DisplayName("test setName()")
    @Test
    void testSetName() {
        liquid.setName("Vodka");
        assertEquals("Vodka", liquid.getName());
    }

    @DisplayName("test getVolume()")
    @Test
    void testGetVolume() {
        assertEquals(300, liquid.getVolume());
    }

    @DisplayName("test setVolume()")
    @Test
    void testSetVolume() {
        liquid.setVolume(200);
        assertEquals(200, liquid.getVolume());
    }

    @DisplayName("test getAlcoholPercent()")
    @Test
    void testGetAlcoholPercent() {
        assertEquals(20, liquid.getAlcoholPercent());
    }

    @DisplayName("test setAlcoholPercent()")
    @Test
    void testSetAlcoholPercent() {
        liquid.setAlcoholPercent(25);
        assertEquals(25, liquid.getAlcoholPercent());
    }



}
