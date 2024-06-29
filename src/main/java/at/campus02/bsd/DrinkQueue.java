package at.campus02.bsd;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public class DrinkQueue implements IQueue {


    private ArrayList<String> drinkQueue;

    public DrinkQueue() {
        drinkQueue = new ArrayList<String>();
    }

    @Override
    public boolean offer(String obj) {
        return drinkQueue.add(obj);
    }

    @Override
    public String poll() {
        if (drinkQueue.isEmpty()) {
            return null;
        }
        else{
            return drinkQueue.removeFirst();
        }
    }

    @Override
    public String remove() {
        if (drinkQueue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            return drinkQueue.removeFirst();
        }
    }

    @Override
    public String peek() {
        if (drinkQueue.isEmpty()) {
            return null;
        } else {
            return drinkQueue.getFirst();
        }
    }

    @Override
    public String element() {
        if (drinkQueue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            return drinkQueue.getFirst();
        }
    }
}
