package at.campus02.bsd;

import java.util.NoSuchElementException;

/**
 * Represents an interface queue for drinks.
 */
public interface IQueue {

  /**
   * Adds a drink to the queue.
   *
   * @param obj the drink to add
   * @return true if the drink was added, false otherwise
   */
  public abstract boolean offer(String obj);

  /**
   * Removes and returns the first drink from the queue.
   *
   * @return the removed drink, or null if the queue is empty
   */
  public abstract String poll();

  /**
   * Removes and returns the first drink from the queue.
   *
   * @return the removed drink
   * @throws NoSuchElementException if the queue is empty
   */
  public abstract String remove();

  /**
   * Returns the first drink from the queue without removing it.
   *
   * @return the first drink, or null if the queue is empty
   */
  public abstract String peek();

  /**
   * Returns the first drink from the queue without removing it.
   *
   * @return the first drink
   * @throws NoSuchElementException if the queue is empty
   */
  public abstract String element();
}