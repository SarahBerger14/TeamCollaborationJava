package at.campus02.bsd;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public class DrinkQueue{


    private ArrayList<Drink> drinkQueue;

    public DrinkQueue() {
        drinkQueue = new ArrayList<Drink>();
    }

    @Override
    public boolean offer(Drink obj) {
        return drinkQueue.add(obj);
    }

    @Override
    public Drink poll() {
        if (drinkQueue.isEmpty()) {
            return null;
        }
        else{
            return drinkQueue.removeFirst();
        }
    }

    @Override
    public Drink remove() {
        if (drinkQueue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            return drinkQueue.removeFirst();
        }
    }

    @Override
    public Drink peek() {
        if (drinkQueue.isEmpty()) {
            return null;
        } else {
            return drinkQueue.getFirst();
        }
    }

    @Override
    public Drink element() {
        if (drinkQueue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            return drinkQueue.getFirst();
        }
    }
}
