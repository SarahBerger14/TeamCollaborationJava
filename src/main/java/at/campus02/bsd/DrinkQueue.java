package at.campus02.bsd;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * Represents a queue for drinks.
 */
public class DrinkQueue{

    /**
     * The list of drinks.
     */
    private final ArrayList<Drink> drinkQueue;

    /**
     * Creates a new drink list.
     */
    public DrinkQueue() {
        drinkQueue = new ArrayList<Drink>();
    }

    /**
     * Adds a drink to the queue.
     *
     * @param obj the drink to add
     * @return true if the drink was added, false otherwise
     */

    public boolean offer(Drink obj) {
        return drinkQueue.add(obj);
    }

    /**
     * Removes and returns the first drink from the queue.
     *
     * @return the removed drink, or null if the queue is empty
     */

    public Drink poll() {
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

    public Drink remove() {
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

    public Drink peek() {
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

    public Drink element() {
        if (drinkQueue.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            return drinkQueue.getFirst();
        }
    }
}