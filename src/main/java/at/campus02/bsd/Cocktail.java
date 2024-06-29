package at.campus02.bsd;
import java.util.List;

/**
 * Represents a cocktail, which is a drink consisting of multiple liquids.
 */
public class Cocktail extends Drink {
    /**
     * The ingredients of the cocktail.
     */
    private final List<Liquid> ingredients;

    /**
     * Creates a new cocktail with the given name and ingredients.
     *
     * @param name        the name of the cocktail
     * @param ingredients the ingredients of the cocktail
     */
    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    /**
     * Returns volume of the cocktail.
     *
     * @return the volume of the cocktail
     */
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid l : ingredients) {
            volume += l.getVolume();
        }
        return volume;
    }

    /**
     * Returns alcohol percentage of the cocktail.
     *
     * @return the alcohol percentage of the cocktail
     */
    @Override
    public double getAlcoholPercent() {
        double alcohol = 0;
        for (Liquid l : ingredients) {
            alcohol += l.getVolume() * (l.getAlcoholPercent() / 100);
        }
        return alcohol / getVolume() * 100;
    }

    /**
     * Returns whether the cocktail contains alcohol or not.
     *
     * @return true if the cocktail contains alcohol, false otherwise
     */
    @Override
    public boolean isAlcoholic() {
        for (Liquid l : ingredients) {
            if (l.getAlcoholPercent() > 0) {
                return true;
            }
        }
        return false;
    }
}