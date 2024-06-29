package at.campus02.bsd;

// IQueue
public interface IQueue {
  /**
   *  add object to queue, true if okay
   * */ 
  public abstract boolean offer(String obj);

  //returns + del 1st element; null if nothing in there
   //
  public abstract String poll();

  /* 
  same as poll, if there is nothing in there error NoSuchElementException
   */
  public abstract String remove();

  // 1st element without dlete, otherwise null
   
  public abstract String peek();

  // element is to peek what remove is to poll
  
  public abstract String element();
}