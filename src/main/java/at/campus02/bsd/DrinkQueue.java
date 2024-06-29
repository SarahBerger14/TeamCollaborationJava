package at.campus02.bsd;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Represents a queue for drinks.
 */
public class DrinkQueue implements IQueue {

    /**
     * The list of drinks.
     */
    private final ArrayList<String> drinkQueue;

    /**
     * Creates a new drink list.
     */
    public DrinkQueue() {
        drinkQueue = new ArrayList<String>();
    }

    /**
     * Adds a drink to the queue.
     *
     * @param obj the drink to add
     * @return true if the drink was added, false otherwise
     */
    @Override
    public boolean offer(String obj) {
        return drinkQueue.add(obj);
    }

    /**
     * Removes and returns the first drink from the queue.
     *
     * @return the removed drink, or null if the queue is empty
     */
    @Override
    public String poll() {
        if (drinkQueue.isEmpty()) {
            return null;
        }
        else{
            return drinkQueue.removeFirst();
        }
    }

    /**
     * Removes and returns the first drink from the queue.
     *
     * @return the removed drink
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String remove() {
        if (drinkQueue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            return drinkQueue.removeFirst();
        }
    }

    /**
     * Returns the first drink from the queue.
     *
     * @return the first drink, or null if the queue is empty
     */
    @Override
    public String peek() {
        if (drinkQueue.isEmpty()) {
            return null;
        } else {
            return drinkQueue.getFirst();
        }
    }

    /**
     * Returns the first drink from the queue.
     *
     * @return the first drink
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String element() {
        if (drinkQueue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            return drinkQueue.getFirst();
        }
    }
}