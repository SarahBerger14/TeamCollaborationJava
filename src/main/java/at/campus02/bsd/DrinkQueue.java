package at.campus02.bsd;

import java.util.ArrayList;


public class DrinkQueue implements IQueue{
    private ArrayList<String> drinkQueue;

    public DrinkQueue() {
        drinkQueue = new ArrayList<String>();
    }

    @Override
    public boolean offer(String obj) {
        return false;
    }

    @Override
    public String poll() {
        return "";
    }

    @Override
    public String remove() {
        return "";
    }

    @Override
    public String peek() {
        return "";
    }

    @Override
    public String element() {
        return "";
    }
}
