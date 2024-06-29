package at.campus02.bsd;

/**
 * Class represents a simple drink which uses only one liquid
 */
public class SimpleDrink extends Drink{

    /**
     * The only liquid in the drink
     */
    protected Liquid l;

    /**
     * Creates a SimpleDrink object with given name and liquid
     *
     * @param name name of drink
     * @param l only liquid in drink
     */
    SimpleDrink(String name, Liquid l){
        super(name);
        this.l = l;
    }

    /**
     * Returns volume of the liquid
     *
     * @return the volume of drink
     */
    @Override
    public double getVolume() {
        return l.getVolume();
    }

    /**
     * Returns alcohol percentage of the liquid
     *
     * @return alcohol percent
     */
    @Override
    public double getAlcoholPercent() {
        return l.getAlcoholPercent();
    }

    /**
     * Gives information if the drink is alcoholic or not
     *
     * @return true when the used liquid is alcoholic, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(l.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }
}
