package at.campus02.bsd;

/**
 * Represents a liquid, which is a drink ingredient.
 */
public class Liquid{

    /**
     * The name of the liquid.
     */
    private String name;

    /**
     * The volume of the liquid in liter.
     */
    private double volume;

    /**
     * The alcohol percentage of the liquid.
     */
    private double alcoholPercent;

    /**
     * Creates a new liquid with the given name, volume and alcohol percentage.
     *
     * @param name           the name of the liquid
     * @param volume         the volume of the liquid in liter
     * @param alcoholPercent the alcohol percentage of the liquid
     */
    public Liquid(String name, double volume, double alcoholPercent) {
        this.name = name;
        this.volume = volume;
        this.alcoholPercent = alcoholPercent;
    }

    /**
     * Returns the name of the liquid.
     *
     * @return the name of the liquid
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the liquid.
     *
     * @param name the name of the liquid
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the volume of the liquid.
     *
     * @return the volume of the liquid
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Sets the volume of the liquid.
     *
     * @param volume the volume of the liquid
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Returns the alcohol percentage of the liquid.
     *
     * @return the alcohol percentage of the liquid
     */
    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    /**
     * Sets the alcohol percentage of the liquid.
     *
     * @param alcoholPercent the alcohol percentage of the liquid
     */
    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }
}
