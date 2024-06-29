package at.campus02.bsd;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Represents a queue for strings.
 */
public class StringQueue implements IQueue {

  /**
   * The list of strings.
   */
  private final List<String> elements = new ArrayList<String>();

  /**
   * The maximum size of the queue.
   */
  private final int maxSize;

  /**
   * Creates a new string queue with the given maximum size.
   *
   * @param maxSize the maximum size of the queue
   */
  public StringQueue(int maxSize) {
    this.maxSize = maxSize;
  }

  /**
   * Adds an element to the queue. If the queue is full, the element is not added.
   *
   * @param obj the element to add
   * @return true if the element was added, false otherwise
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() < maxSize){
      elements.add(obj);}
    else {
      return false;
    }
    return true;
  }

  /**
   * Removes and returns the first element from the queue.
   *
   * @return the removed element, or null if the queue is empty
   */
  @Override
  public String poll() {
    if (!elements.isEmpty()) {
      return elements.removeFirst();
    } else {
      return null;
    }
  }

  /**
   * Removes and returns the first element from the queue.
   *
   * @return the removed element
   * @throws NoSuchElementException if the queue is empty
   */
  @Override
  public String remove() {
    String element = poll();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");
    return element;
  }

  /**
   * Returns the first element from the queue without removing it.
   *
   * @return the first element, or null if the queue is empty
   */
  @Override
  public String peek() {
    if (!elements.isEmpty())
      return elements.get(0);
    else{
    return null;
  }}

  /**
   * Returns the first element from the queue without removing it.
   *
   * @return the first element
   * @throws NoSuchElementException if the queue is empty
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("There's no element any more");

    return element;
  }
}