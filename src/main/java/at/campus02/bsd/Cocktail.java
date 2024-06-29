package at.campus02.bsd;

import java.util.List;

public class Cocktail extends Drink {
    private List<Liquid> ingredients;

    public Cocktail(String name, List<Liquid> ingredients) {
        super(name);
        this.ingredients = ingredients;
    }

    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid l : ingredients) {
            volume += l.getVolume();
        }
        return volume;
    }

    @Override
    public double getAlcoholPercent() {
        double alcohol = 0;
        for (Liquid l : ingredients) {
            alcohol += l.getVolume() * (l.getAlcoholPercent() / 100);
        }
        return alcohol / getVolume() * 100;
    }

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